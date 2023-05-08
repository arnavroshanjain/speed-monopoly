package com.cm6123.monopoly.game;

public class Players {
    String name;
    public int balance;
    int currentLocation;

    public Players (String name){
        this.name = name;
        this.balance = 1000;
        this.currentLocation = 1;
    }

    public int getBalance() {
        return balance;
    }

    public int getCurrentLocation() {
        return currentLocation;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCurrentLocation(int currentLocation) {
        this.currentLocation = currentLocation;
    }

//    public String toString() {
//        return "Name: " + name + ", Balance: " + balance + ", Location: " + currentLocation;
//    }

    public void addBalance(int balance) {
        this.balance += balance;
    }

    public void subtractBalance(int balance) {
        this.balance -= balance;
    }

    public void updateLocation(int currentLocation) {
        if (this.currentLocation + currentLocation > 16) {
            this.currentLocation = (this.currentLocation + currentLocation) - 16;

        } else {
            this.currentLocation += currentLocation;
        }
    }

    public String getName() {
        return name;
    }

//    public void move(int numSpaces) {
//        this.currentLocation += numSpaces;
//        if (this.currentLocation > 16) {
//            this.currentLocation -= 16 ;
//            this.addBalance(200); // collect $200 for passing Go
//        }
//    }

    public void move(int diceRoll, Board board) {
        // Move the player by the given number of spaces on the board
        updateLocation(diceRoll);
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Balance: " + balance + ", Location: " + currentLocation;
    }


    public static Players getPlayerWithPositiveBalance(Players[] players) {
        for (Players player : players) {
            if (player.getBalance() > 0) {
                return player;
            }
        }
        return null;
    }

    public void setOutOfGame(boolean b) {
    }

    public boolean isOutOfGame() {
        return false;
    }
}