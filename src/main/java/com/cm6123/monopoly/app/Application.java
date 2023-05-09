package com.cm6123.monopoly.app;

import com.cm6123.monopoly.dice.Dice;
import com.cm6123.monopoly.game.AllProperties;
import com.cm6123.monopoly.game.Board;
import com.cm6123.monopoly.game.Players;
import com.cm6123.monopoly.game.Property;
import com.cm6123.monopoly.game.Station;
import com.cm6123.monopoly.game.Tax;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Scanner;


public final class Application {

    /**
     * Create a logger for the class.
     */
    private static final Logger logger = LoggerFactory.getLogger(Application.class);


    private Application() {
    }

    /**
     * main entry point.  If args provided, result is displayed and program exists. Otherwise, user is prompted for
     * input.
     *
     * @param args command line args.
     */
    public static void main(final String[] args) {

        try {

        logger.info("Application Started with args:{}", String.join(",", args));

        System.out.println("Hello. Welcome to Monopoly.");


        Board sampleBoard = new Board();
        /*
        System.out.println(Arrays.toString(sampleBoard.board));
        Players Arnav = new Players("Arnav");
        System.out.println(Arnav.balance);
        */

        /* Starting the Game, asking the number of players */

        Scanner sc = new Scanner(System.in);


        /* Ask the users for the number of players with Validation */
        int numPlayers;
        do {
            System.out.print("Enter the number of players (2-10):  ");
            numPlayers = sc.nextInt();
            sc.nextLine();
        } while (numPlayers < 2 || numPlayers > 10);
        System.out.println(numPlayers);


        /* Get number of players
        System.out.print("Enter number of players: ");
        int numPlayers = sc.nextInt();
        sc.nextLine();
        */

        // Creates an array of the players
        Players[] players = new Players[numPlayers];

        // Gets the details for each player
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("\nPlayer " + (i + 1));
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            players[i] = new Players(name);
        }

        // Prints the details of all the players
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("\nPlayer " + (i + 1));
            System.out.println(players[i].toString());
        }


        // test balance of a player: System.out.println(players[1].getBalance());

        System.out.println("Lets Start!");
        System.out.println("====================================");

        // Creating an Array of all the properties and intialising them, with relevant thier classes

        AllProperties[] properties = new AllProperties[16];
        properties[0] = new Property("Home", 0, true, 0, 0, "bank");
        properties[1] = new AllProperties("Road", 1, false);
        properties[2] = new AllProperties("Road", 2, false);
        properties[3] = new Property("Old Kent Road", 3, true, 60, 2, "bank");
        properties[4] = new Property("Pall Mall", 4, true, 140, 10, "bank");
        properties[5] = new AllProperties("Road", 5, false);
        properties[6] = new Station("Paddington", 6);
        properties[7] = new AllProperties("Road", 7, false);
        properties[8] = new Property("The Strand", 8, true, 220, 18, "bank");
        properties[9] = new AllProperties("Road", 9, false);
        properties[10] = new Tax("Tax Office", 10, false);
        properties[11] = new Station("Waterloo", 11);
        properties[12] = new Property("Leicester Square", 12, true, 260, 22, "bank");
        properties[13] = new AllProperties("Road", 13, false);
        properties[14] = new Property("Park Lane", 14, true, 350, 35, "bank");
        properties[15] = new AllProperties("Road", 15, false);

        /* Test code and update code for Owner
        System.out.println(properties[14].getOwner());
        properties[4].availablePurchase = false;
        System.out.println(properties[4].getAvailablePurchase());
        */

        Dice dice = new Dice(6);

        /* Test code to add balance
         players[1].addBalance(100);
        to add balance System.out.println(players[1].getBalance());
        */


//            player.updateLocation(sum);
//            System.out.println(player.getName() + " rolled a " + roll1 + " and a " + roll2 + " for a total of " + sum + " and landed on " + player.getCurrentLocation());




        // Roll dice for each player and move them to a property
        boolean gameContinues = true;
        while (gameContinues) {

            for (int i = 0; i < numPlayers; i++) {
                System.out.println("It is now " + players[i].getName() + "'s turn.");

                // Roll dice twice and sum the result
                int diceRoll1 = dice.roll();
                int diceRoll2 = dice.roll();
                int diceSum = diceRoll1 + diceRoll2;

                // Move player to property based on dice roll
                players[i].move(diceSum, sampleBoard);
                System.out.println(players[i].getName() + " rolled a " + diceRoll1 + " and a " + diceRoll2 + " for a total of " + diceSum + " and landed on " + sampleBoard.getSquareName(players[i].getCurrentLocation()));
                System.out.println(players[i]);


                AllProperties currentProperty = properties[players[i].getCurrentLocation()];
                if (currentProperty instanceof Property && currentProperty.isAvailablePurchase()) {
                    // Allows player to buy property if it is available for purchase
                    System.out.println(players[i].getName() + " , you have landed on an unowned property: " + currentProperty.getName() + ".");
                    System.out.println("The price is " + ((Property) currentProperty).getPurchasePrice() + ".");
                    // Ask player if they want to buy the property
                    System.out.print("Do you want to buy it? (Y/N) ");
                    String input = sc.nextLine().toUpperCase();

                    // Processes player input
                    if (input.equals("Y")) {
                        // Deduct property price from player's balance and set player as property owner
                        players[i].subtractBalance(((Property) currentProperty).getPurchasePrice());
                        ((Property) currentProperty).setOwner(players[i].getName());
                        System.out.println("Congratulations! You are now the owner of " + currentProperty.getName() + ".");
                        System.out.println(currentProperty.getOwner());

                        currentProperty.setAvailablePurchase(false);
                    } else {
                        // Mark property as unavailable for purchase

                        System.out.println("Okay, The property has not been sold");
                    }
                } else if (currentProperty instanceof Tax) {
                 // Deduct tax from player's balance

                    Tax.taxPayment(diceRoll1, diceRoll2, players[i].getBalance(), players[i]);
                    System.out.println(players[i].getName() + " , you have landed on the Tax Office, you have paid tax. Current Balance:" + players[i].getBalance());

                } else if (currentProperty instanceof Station) {
                    Station currentStation = (Station) currentProperty;
                    Station.stationTicket(diceSum, players[i]);
                    System.out.println(players[i].getName() + " , you have landed on " + currentProperty.getName() + " and paid for a ticket. Current Balance:" + players[i].getBalance());
                } else if (currentProperty instanceof Property && !(currentProperty.isAvailablePurchase()) && currentProperty.getOwner() != players[i].getName()) {
                    String ownerName = currentProperty.getOwner();
                    Players owner = Property.playerName(ownerName, players);
                    Property.payRent(players[i], owner, ((Property) currentProperty).getRent());
                }
                System.out.println("====================================");


                if (players[i].getBalance() < 0) {
                    System.out.println("Player " + players[i].getName() + " has gone bankrupt and is out of the game.");
                    players[i].setOutOfGame(true);
                }

                // Check if only one player is left
                int remainingPlayers = 0;
                Players remainingPlayer = null;
                for (Players player : players) {
                    if (!player.isOutOfGame()) {
                        remainingPlayers++;
                        remainingPlayer = player;
                    }
                }

                if (remainingPlayers == 1) {
                    gameContinues = false;
                    System.out.println("Game over! The winner is " + remainingPlayer.getName() + "!");
                    break;
                }
            }
        }


        sc.close();

        } catch (Exception e) {
            System.out.println("Error occurred" + e);
        }


        logger.info("Application closing");
    }

}
