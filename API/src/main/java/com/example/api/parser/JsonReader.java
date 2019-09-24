/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.api.parser;

/**
 *
 * @author Boris
 */
import com.example.api.databaseLogiс.CharacterData;
import com.example.api.entity.CharacterEntity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonReader {

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    private static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }

    public static void read() throws IOException, JSONException, ParseException {
        JSONObject jsons = readJsonFromUrl("https://rickandmortyapi.com/api/character");
        int counter = Integer.valueOf(jsons.getJSONObject("info").get("count").toString());
        for (int i = 1; i <= counter; i++) {
            JSONObject json = readJsonFromUrl("https://rickandmortyapi.com/api/character/" + i);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SS'Z'", Locale.US);
            format.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date date = format.parse((String) json.get("created"));
            CharacterEntity character = new CharacterEntity(
                    (int) json.get("id"),
                    (String) json.get("name"),
                    (String) json.get("status"),
                    (String) json.get("species"),
                    (String) json.get("type"),
                    (String) json.get("gender"),
                    json.getJSONObject("origin").get("name").toString() + " " 
                            + json.getJSONObject("origin").get("url").toString(),
                    json.getJSONObject("location").get("name").toString() + " " 
                            + json.getJSONObject("origin").get("url").toString(),
                    (String) json.get("image"),
                    readEps(i),
                    (String) json.get("url"), date);
            CharacterData cd = new CharacterData();
            cd.save(character);
        }
    }
    public static String readEps (int counter) throws IOException, JSONException{
        StringBuilder res = new StringBuilder();
        JSONObject json = readJsonFromUrl("https://rickandmortyapi.com/api/character/" + counter);
        
        for (int i = 0; i < json.getJSONArray("episode").length(); i++){
            res.append(json.getJSONArray("episode").get(i).toString().replaceAll("https://rickandmortyapi.com/api/episode/", "ep")).append(" ");
        }

        return res.toString().trim();
    }
}
