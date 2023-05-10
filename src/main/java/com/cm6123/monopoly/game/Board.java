package com.cm6123.monopoly.game;

public class Board {
    /**
     * This class represents the board of the game.
     * It is a singleton class.
     * It should not have any user interface code in it.
     */
    public static  String[] board;
    /**
     * Constructs a new Board object.
     */
    public Board() {

        board = new String[]{ "Home", "Road", "Road", "Old Kent Road", "Pall Mall", "Road", "Paddington", "(8) Road",
                "The Strand", "Road", "Tax Office", "Waterloo", "Leicester Square", "Road",
                "Park Lane", "Road"};
    }

    /** Returns the length of the board.
     * @return returns the length of the board.
     */
    public int getBoardLength(){
        return board.length;
    }

    /**
     * Returns the name of the square at the given location.
     * @param currentLocation
     * @return returns the name of the square at the given location.
     */
    public String getSquareName(final int currentLocation) {
        return board[currentLocation];
    }
}

