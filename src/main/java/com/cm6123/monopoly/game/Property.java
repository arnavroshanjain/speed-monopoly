package com.cm6123.monopoly.game;

/** This class is used to create a Property object. */
public class Property extends AllProperties {
    /** The purchase price of the property. */
    private int purchasePrice;
    /** The rent of the property. */
    private int rent;
    /** The owner of the property. */
    private static String owner;


    /**
     * Constructor to create a Property object.
     *
     * @param name              The name of the property.
     * @param spaceID           The ID of the space where the property is located.
     * @param isAvailablePurchase    True if the property can be purchased, false otherwise.
     * @param purchasePrice     The purchase price of the property.
     * @param rent              The rent of the property.
     * @param owner             The owner of the property.
     */

    public Property(final String name, final int spaceID, final boolean isAvailablePurchase, final int purchasePrice, final int rent, final String owner) {
        super(name, spaceID, true);
        //Property propertyObject = new Property(name, spaceID, purchasePrice, rent, availablePurchase);
        this.purchasePrice = purchasePrice;
        this.rent = rent;
        this.owner = owner;

    }

    /**
     * Method to pay rent if the property is owned by someone other than the current player.
     *
     * @param property  The property being rented.
     * @param players   An array of all the players in the game.
     */
        public void payRentIfOwned(final Property property, final Players[] players) {
            if (!property.getOwner().equals("bank") && !property.getOwner().equals(name)) {
                for (Players player : players) {
                    if (player.getName().equals(property.getOwner())) {
                        int rentAmount = property.getRent();
                        payRent(player, playerName(property.getOwner(), players), rentAmount);
                    }
                }
            }
        }

    /**
     * Method to pay rent to the property owner.
     *
     * @param player        The player paying the rent.
     * @param owner         The owner of the property receiving the rent.
     * @param rentAmount    The amount of rent being paid.
     */

    public static void payRent(final Players player, final Players owner, final int rentAmount) {
        player.addBalance(rentAmount);
        owner.addBalance(rentAmount);
        System.out.println(player.getName() + " paid " + rentAmount + " rent to " + owner.getName());
    }

    /**
     * Method to get the player object associated with a given player name.
     *
     * @param playerName    The name of the player to find.
     * @param players       An array of all the players in the game.
     * @return              The player object with the given name.
     */
    public static Players playerName (final String playerName, final Players[] players){
        for (Players player : players) {
            if (player.getName() == playerName) {
                return player;
            }
        }
        return null;
    }

    /**
     * Method to get the rent of the property.
     *
     * @return  The rent of the property.
     */
    public int getRent() {
        return rent;
    }
    /**
     * Method to get the purchase price of the property.
     *
     * @return  The purchase price of the property.
     */
    public int getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * Method to get the owner of the property.
     *
     * @return  The owner of the property.
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Method to set the owner of the property.
     *
     * @param owner The new owner of the property.
     */
    public void setOwner(final String owner) {
        this.owner = owner;
    }




}
