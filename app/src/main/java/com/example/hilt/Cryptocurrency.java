package com.example.hilt;

public class Cryptocurrency  {
    public String image, name;
    public Cryptocurrency(String image, String name){
        this.image = image;
        this.name = name;
    }
    public String getImage(){
        return image;
    }
    public String getName(){
        return name;
    }

    /*public void setImage(String image) {
        this.image = image;
    }
    public void setName(String name){
        this.name = name;
    }*/
    // simple Data class in java
}
