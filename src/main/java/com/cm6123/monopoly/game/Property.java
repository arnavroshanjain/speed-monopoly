package com.cm6123.monopoly.game;

public class Property extends AllProperties {

    int purchasePrice;
    int rent;
    String owner;

    public Property(String name, int spaceID, boolean isAvailablePurchase, int purchasePrice, int rent, String owner) {
        super(name, spaceID, true);
        //Property propertyObject = new Property(name, spaceID, purchasePrice, rent, availablePurchase);
        this.purchasePrice = purchasePrice;
        this.rent = rent;
        this.owner = owner;

    }

    public int getRent() {
        return rent;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }




}
