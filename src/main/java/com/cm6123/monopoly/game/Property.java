package com.cm6123.monopoly.game;

public class Property extends AllProperties {

    int purchasePrice;
    int rent;
    String owner;

    public Property(String name, int spaceID, int purchasePrice, int rent, String owner) {
        super(name, spaceID);
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




}
