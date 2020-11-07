package com.example.project;

public class MainModel {
    Integer artLogo;
    String artName;

    public MainModel(Integer artLogo,String artName){
        this.artLogo = artLogo;
        this.artName = artName;
    }

    public Integer getArtLogo() {
        return artLogo;
    }

    public String getArtName() {
        return artName;
    }
}

