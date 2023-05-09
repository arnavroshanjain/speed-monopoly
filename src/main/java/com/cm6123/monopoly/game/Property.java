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



        public void payRentIfOwned(Property property, Players[] players) {
            if (!property.getOwner().equals("bank") && !property.getOwner().equals(name)) {
                for (Players player : players) {
                    if (player.getName().equals(property.getOwner())) {
                        int rentAmount = property.getRent();
                        payRent(player, playerName(property.getOwner(), players), rentAmount);
                    }
                }
            }
        }

    public static void payRent(Players player, Players owner, int rentAmount) {
        player.addBalance(rentAmount);
        owner.addBalance(rentAmount);
        System.out.println(player.getName() + " paid " + rentAmount + " rent to " + owner.getName());
    }


//    public static void payRent(int rent, Players playerReceiving, Players playerPaying) {
//        playerReceiving.subtractBalance(rent);
//        playerPaying.addBalance(rent);
//    }
    public static Players playerName (String playerName, Players[] players){
        for (Players player : players) {
            if (player.getName() == playerName) {
                return player;
            }
        }
        return null;
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
