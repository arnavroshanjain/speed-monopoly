package com.cm6123.monopoly.game;

public class Board {

    public static  String[] board;
    public Board() {

        board = new String[]{ "(1) Home", "(2) Road", "(3) Road", "(4) Old Kent Road", "(5) Pall Mall", "(6) Road",
                "(7) Paddington", "(8) Road", "(9) The Strand", "(10) Road", "(11) Tax Office", "(12) Waterloo", "(13) Leicester Square",
                "(14) Road", "(15) Park Lane", "(16) Road"};
    }

    public int getBoardLength(){
        return board.length;
    }

    public String getSquareName(int currentLocation) {
        return board[currentLocation];
    }
}

