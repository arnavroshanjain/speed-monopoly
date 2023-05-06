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

    public String toString() {
        return "Name: " + name + ", Balance: " + balance + ", Location: " + currentLocation;
    }

    public void addBalance(int balance) {
        this.balance += balance;
    }

    public void subtractBalance(int balance) {
        this.balance -= balance;
    }

    public void updateLocation(int currentLocation) {
        this.currentLocation += currentLocation;
    }

    public String getName() {
        return name;
    }

    public void move(int numSpaces) {
        this.currentLocation += numSpaces;
        if (this.currentLocation > 16) {
            this.currentLocation -= 16 ;
            this.addBalance(200); // collect $200 for passing Go
        }
    }


}