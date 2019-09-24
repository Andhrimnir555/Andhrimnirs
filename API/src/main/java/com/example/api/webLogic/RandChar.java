/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.api.webLogic;

import com.example.api.databaseLogiс.CharacterData;
import com.example.api.entity.CharacterEntity;
import java.util.Random;

/**
 *
 * @author Boris
 */
public class RandChar {


    private final Random r = new Random();
    private int rand = r.nextInt((CharacterData.findAll().size() - 1) + 1) + 1;

    private final CharacterEntity characterEntity = CharacterData.findById(rand);
    

    public CharacterEntity getContent() {
        return characterEntity;
    }
}
