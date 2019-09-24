/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.api.job;

/**
 *
 * @author Boris
 */
import com.example.api.BasicApplication;
import com.example.api.parser.JsonReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.quartz.CronScheduleBuilder;

import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class JobLogic implements Job {

    public static void update() {
                try {
            JobDetail job = JobBuilder.newJob(JobLogic.class)
                    .withIdentity("job1", "group1").build();
            Trigger trigger1 = TriggerBuilder.newTrigger()
                    .withIdentity("cronTrigger1", "group1")
                    .withSchedule(CronScheduleBuilder.cronSchedule("0 */5 * ? * *"))
                    .build();

            Scheduler scheduler1 = new StdSchedulerFactory().getScheduler();
            scheduler1.start();
            scheduler1.scheduleJob(job, trigger1);
        } catch (SchedulerException ex) {
            Logger.getLogger(BasicApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        try {
            JsonReader.read();
        } catch (IOException | JSONException | ParseException ex) {
            Logger.getLogger(JobLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
