package com.cm6123.monopoly.game;

public class Tax extends AllProperties {

    public Tax(String name, int spaceID, boolean isAvaliablePurchase) {
        super(name, spaceID, false);
    }

    public static void taxPayment(int diceRoll1, int diceRoll2, int balance, Players playerDetails) {
        if (diceRoll1 == diceRoll2) {
            playerDetails.subtractBalance((int) (0.1 * balance));
        } else {
            playerDetails.subtractBalance((int) (0.05 * balance));
        }
    }
}




