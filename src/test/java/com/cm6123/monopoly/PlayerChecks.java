package com.cm6123.monopoly;

import com.cm6123.monopoly.game.Board;
import com.cm6123.monopoly.game.Players;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerChecks {

    Players testPlayer = new Players("Test Player");
        @Test
        public void testGetBalance() {
            assertEquals(1000, testPlayer.getBalance());
        }

        @Test
        public void testGetCurrentLocation() {
            assertEquals(1, testPlayer.getCurrentLocation());
        }

        @Test
        public void testSetBalance() {
            testPlayer.setBalance(500);
            assertEquals(500, testPlayer.getBalance());
        }

        @Test
        public void testSetCurrentLocation() {
            testPlayer.setCurrentLocation(5);
            assertEquals(5, testPlayer.getCurrentLocation());
        }

        @Test
        public void testAddBalance() {
            testPlayer.addBalance(500);
            assertEquals(1500, testPlayer.getBalance());
        }

        @Test
        public void testSubtractBalance() {
            testPlayer.subtractBalance(500);
            assertEquals(500, testPlayer.getBalance());
        }

        @Test
        public void testUpdateLocation() {
            testPlayer.updateLocation(5);
            assertEquals(6, testPlayer.getCurrentLocation());
            testPlayer.updateLocation(11);
            assertEquals(1, testPlayer.getCurrentLocation());
        }

        @Test
        public void testGetName() {
            assertEquals("Test Player", testPlayer.getName());
        }

        @Test
        public void testMove() {
            Board board = new Board();
            testPlayer.move(5, board);
            assertEquals(6, testPlayer.getCurrentLocation());
        }

        @Test
        public void testGetPlayerWithPositiveBalance() {
            Players[] players = new Players[] {
                    new Players("Test Player"),
                    new Players("Test Player 2"),
                    new Players("Test Player 3")
            };
            players[0].setBalance(500);
            players[1].setBalance(0);
            players[2].setBalance(-500);

            assertEquals(players[0], Players.getPlayerWithPositiveBalance(players));
            assertNull(Players.getPlayerWithPositiveBalance(new Players[] { players[1], players[2] }));
        }

        @Test
        public void testSetOutOfGame() {
            testPlayer.setOutOfGame(true);
            assertTrue(testPlayer.isOutOfGame());
        }
}
