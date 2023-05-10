package com.cm6123.monopoly.game;

public class Station extends AllProperties {
    /**
     * Constructs a new Station object.
     *
     * @param name the name of the property
     * @param spaceID the space ID of the property on the game board
     */
    public Station(final String name, final int spaceID) {
        super(name, spaceID, false);
    }
    /**
     * Method to pay Station Ticket.
     * @param dicesum the sum of the dice roll
     * @param playerDetails the player who landed on the station
     */
    public static void stationTicket(final int dicesum, final Players playerDetails) {
        playerDetails.subtractBalance(10 * dicesum);
    }

}


