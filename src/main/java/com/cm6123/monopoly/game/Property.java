package com.cm6123.monopoly.game;

public class Property extends AllProperties {

    int purchasePrice;
    int rent;
    static String owner;

    public Property(String name, int spaceID, boolean isAvailablePurchase, int purchasePrice, int rent, String owner) {
        super(name, spaceID, true);
        //Property propertyObject = new Property(name, spaceID, purchasePrice, rent, availablePurchase);
        this.purchasePrice = purchasePrice;
        this.rent = rent;
        this.owner = owner;

    }

        public static void payRent(int rent, Players playerReceiving, Players playerPaying) {
        playerReceiving.subtractBalance(rent);
        playerPaying.addBalance(rent);
    }

//    public Players playerName (String playerName, Players[]){
//        Players[] players;
//        for (Players player : players) {
//            if (player.getName() == owner) {
//                return player;
//            }
//        }
//    }


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
