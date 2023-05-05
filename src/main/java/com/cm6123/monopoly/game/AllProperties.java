package com.cm6123.monopoly.game;

public class AllProperties {
    public String owner ;
    String name;
    public int spaceID;

    public AllProperties(String name, int spaceID) {
        this.name = name;
        this.spaceID = spaceID;
    }

    public int getSpaceID() {
        return spaceID;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }



    public String toString() {
        return super.toString();
    }





}



