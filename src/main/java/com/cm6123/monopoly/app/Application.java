package com.cm6123.monopoly.app;

import com.cm6123.monopoly.game.AllProperties;
import com.cm6123.monopoly.game.Board;
import com.cm6123.monopoly.game.Players;
import com.cm6123.monopoly.game.AllProperties;
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
    private static Logger logger = LoggerFactory.getLogger(Application.class);


    private Application() {
    }

    /**
     * main entry point.  If args provided, result is displayed and program exists. Otherwise, user is prompted for
     * input.
     *
     * @param args command line args.
     */
    public static void main(final String[] args) {

        logger.info("Application Started with args:{}", String.join(",", args));

        System.out.println("Hello. Welcome to Monopoly.");

        /* Test Code
        Board sampleBoard = new Board();
        System.out.println(Arrays.toString(sampleBoard.board));
        Players Arnav = new Players("Arnav");
        System.out.println(Arnav.balance);
        */

        /* Starting the Game, asking the number of players */

        Scanner sc = new Scanner(System.in);


        /* Ask the users for the number of players with Validation */
        int numPlayers;
        do {
            System.out.print("Enter number of players: ");
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

        // Get details for each player
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("\nPlayer " + (i+1));
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            players[i] = new Players(name);
        }

        // Print details of all players
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("\nPlayer " + (i+1));
            System.out.println(players[i].toString());
        }


        // test balance of a player: System.out.println(players[1].getBalance());


        System.out.println("Lets Start!");

        // Creating an Array of all the properties and intialising them.

        AllProperties[] properties = new AllProperties[16];
        properties[0] = new Property("Home", 0, 0, 0, "bank");
        properties[1] = new AllProperties("Road", 1);
        properties[2] = new AllProperties("Road", 2);
        properties[3] = new Property("Old Kent Road", 3, 60, 2, "bank");
        properties[4] = new Property("Pall Mall", 4, 140, 10, "bank");
        properties[5] = new AllProperties("Road", 5);
        properties[6] = new Station("Paddington", 6, false);
        properties[7] = new AllProperties("Road", 7);
        properties[8] = new Property("The Strand", 8, 220, 18, "bank" );
        properties[9] = new AllProperties("Road", 9);
        properties[10] = new Tax("Tax Office", 10, false);
        properties[11] = new Station("Waterloo", 11, false);
        properties[12] = new Property("Leicester Square", 12, 260, 22, "bank");
        properties[13] = new AllProperties("Road", 13);
        properties[14] = new Property("Park Lane", 14, 350, 35, "bank");
        properties[15] = new AllProperties("Road", 15);

        /* Test code and update code for Owner
        System.out.println(properties[14].getOwner());
        properties[4].availablePurchase = false;
        System.out.println(properties[4].getAvailablePurchase());
        */


        /* Test code to add balance
         players[1].addBalance(100);
        to add balance System.out.println(players[1].getBalance());
        */


        // test rent of a property: System.out.println(properties[15].getRent());

        logger.info("Application closing");
    }


}


