package com.example.api;

import com.example.api.job.JobLogic;
import com.example.api.parser.JsonReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class BasicApplication {

    public static void main(String[] args) {
        try {
            JsonReader.read();
        } catch (IOException | JSONException | ParseException ex) {
            Logger.getLogger(BasicApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        JobLogic.update();
        SpringApplication.run(BasicApplication.class, args);
    }
}
