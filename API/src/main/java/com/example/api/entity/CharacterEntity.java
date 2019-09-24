/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.api.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Boris
 */
@Entity(name = "CharacterEntity")

@Table(name = "charactersrm")
public class CharacterEntity implements Serializable {

    private static final long serialVersionUID = 6227818748238399683L;

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "charname")
    private String name;
    @Column(name = "status")
    private String status;
    @Column(name = "species")
    private String species;
    @Column(name = "chartype")
    private String type;
    @Column(name = "gender")
    private String gender;
    @Column(name = "origin")
    private String origin;
    @Column(name = "location")
    private String location;
    @Column(name = "image")
    private String image;
    @Column(name = "episodes")
    private String episode;
    @Column(name = "url")
    private String url;
    @Column(name = "created")
    private Date created;

    public CharacterEntity() {
    }

    public CharacterEntity(int id, String name, String status, String species, String type, String gender, String origin, String location, String image, String episode, String url, Date created) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.species = species;
        this.type = type;
        this.gender = gender;
        this.origin = origin;
        this.location = location;
        this.image = image;
        this.episode = episode;
        this.url = url;
        this.created = created;
    }
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * @param species the species to set
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * @param origin the origin to set
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the episode
     */
    public String getEpisode() {
        return episode;
    }

    /**
     * @param episode the episode to set
     */
    public void setEpisode(String episode) {
        this.episode = episode;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created the created to set
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return getId() + " " + getName() + " " + getStatus() + " " + getSpecies() + " "
                + getType() + " " + getGender() + " " + getOrigin() + " " + getLocation() + " "
                + getImage() + " " + getEpisode() + " " + getUrl() + " " + getCreated();
    }
}
