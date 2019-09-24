/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.api.webLogic;

import com.example.api.databaseLogiс.CharacterData;
import java.util.ArrayList;

/**
 *
 * @author Boris
 */
public class ListChars {

    private final ArrayList<String> charactersEntity;

    public ListChars(String name) {
        this.charactersEntity = getList(name);
    }

    private static ArrayList<String> getList(String string) {
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < CharacterData.findAll().size(); i++) {
            if (CharacterData.findAll().get(i).getName().toLowerCase().contains(string.toLowerCase())) {
                temp.add(CharacterData.findAll().get(i).getName());
            }
        }
        return temp;
    }

    public String getContent() {
        return charactersEntity.toString().substring(1, charactersEntity.toString()
                .length() - 1);
    }
}
