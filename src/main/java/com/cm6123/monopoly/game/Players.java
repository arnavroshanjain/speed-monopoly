package com.cm6123.monopoly.game;

public class Players {
    /** The name of the player. */
    private String name;
    /** The balance of the player. */
    private int balance;
    /** The current location of the player. */
    private int currentLocation;
    /** Whether the player is bankrupt. */
    private boolean isBankrupt;
/**
     * Constructs a new Players object.
     *
     * @param lname the name of the player
     */
    public Players (final String lname){
        this.name = lname;
        this.balance = 1000;
        this.currentLocation = 1;
        this.isBankrupt = false;
    }
    /** Returns the balance of the player.
     * @return the balance of the player.
     */
    public int getBalance() {
        return balance;
    }
    /**
     * Returns the current location of the player.
     *
     * @return the current location of the player
     */
    public int getCurrentLocation() {
        return currentLocation;
    }
    /** Sets the balance of the player.
     * @param lbalance the balance of the player.
     */
    public void setBalance(final int lbalance) {
        this.balance = lbalance;
    }
    /**
     * Sets the current location of the player.
     *
     * @param lcurrentLocation the current location of the player
     */
    public void setCurrentLocation(final int lcurrentLocation) {
        this.currentLocation = lcurrentLocation;
    }

//    public String toString() {
//        return "Name: " + name + ", Balance: " + balance + ", Location: " + currentLocation;
//    }
    /** to add balance.
     * @param lbalance add balance to a player.
     */
    public void addBalance(final int lbalance) {
        this.balance += lbalance;
    }
    /** to subtract balance.
     * @param lbalance subtract balance from a player.
     */
    public void subtractBalance(final int lbalance) {
        this.balance -= lbalance;
    }
    /** to update location.
     * @param currentLocation update location of a player.
     */
    public void updateLocation(final int currentLocation) {
        if (this.currentLocation + currentLocation > 15) {
            this.currentLocation = (this.currentLocation + currentLocation) - 16;

        } else {
            this.currentLocation += currentLocation;
        }
    }

    /** Returns the name of the player.
     * @return the name of the player.
     */
    public  String getName() {
        return this.name;
    }

//    public void move(int numSpaces) {
//        this.currentLocation += numSpaces;
//        if (this.currentLocation > 16) {
//            this.currentLocation -= 16 ;
//            this.addBalance(200); // collect $200 for passing Go
//        }
//    }
    /**
     * Moves the player by the given number of spaces on the board.
     *
     * @param diceRoll the number of spaces to move the player
     * @param board the game board
     */
    public void move(final int diceRoll, final Board board) {
        // Move the player by the given number of spaces on the board
        updateLocation(diceRoll);
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Balance: " + balance + ", Location: " + currentLocation;
    }

    /** Returns players with a positive balance.
     * @param players
     * @return players with a positive balance
     */
    public static Players getPlayerWithPositiveBalance(final Players[] players) {
        for (Players player : players) {
            if (player.getBalance() > 0) {
                return player;
            }
        }
        return null;
    }
    /**
     * Sets whether the player is out of the game.
     *
     * @param b whether the player is out of the game
     */

    public void setOutOfGame(final boolean b) {
        this.isBankrupt = b;
    }

    /**
     * Returns whether the player is out of the game.
     * @return whether the player is out of the game
     */
    public boolean isOutOfGame() {
        return this.isBankrupt;
    }


}

