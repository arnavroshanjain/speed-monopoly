package com.cm6123.monopoly.game;

public class Station extends AllProperties {

    public Station(String name, int spaceID) {
        super(name, spaceID, false);
    }

    public static void stationTicket(int dicesum, Players playerDetails) {
        playerDetails.subtractBalance(10 * dicesum);
    }

}


