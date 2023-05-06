package com.cm6123.monopoly.game;

public class AllProperties {
    public String owner ;
    String name;
    public int spaceID;

    public boolean isAvailablePurchase;

    public AllProperties(String name, int spaceID, boolean isAvailablePurchase) {
        this.name = name;
        this.spaceID = spaceID;
        this.isAvailablePurchase = isAvailablePurchase;

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


    public void setAvailablePurchase(boolean availablePurchase) {
        isAvailablePurchase = availablePurchase;
    }

    public String toString() {
        return super.toString();
    }


    public boolean isAvailablePurchase() {
        return isAvailablePurchase;
    }
}



