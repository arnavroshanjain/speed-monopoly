package com.cm6123.monopoly.game;

public class Tax extends AllProperties {
    /**
     * Constructs a new Tax object.
     *
     * @param name the name of the property
     * @param spaceID the space ID of the property on the game board
     * @param isAvaliablePurchase whether the property is available for purchase
     */
    public Tax(final String name, final int spaceID, final boolean isAvaliablePurchase) {
        super(name, spaceID, false);
    }
    /** Method to calculate tax payment.
     * @param diceRoll1
     * @param diceRoll2
     * @param balance
     * @param playerDetails
     */
    public static void taxPayment(final int diceRoll1, final int diceRoll2, final int balance, final Players playerDetails) {
        if (diceRoll1 == diceRoll2) {
            playerDetails.subtractBalance((int) (0.1 * balance));
        } else {
            playerDetails.subtractBalance((int) (0.05 * balance));
        }
    }
}




