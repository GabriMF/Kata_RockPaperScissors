package com.factoriaf5.rps.models;

public class Player {
    
    public Rock choose(String string){
        if(string == "Rock"){
            return new Rock();
        }
        return null;
    }
}
