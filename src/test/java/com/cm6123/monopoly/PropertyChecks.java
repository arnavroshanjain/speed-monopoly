package com.cm6123.monopoly;

import com.cm6123.monopoly.game.AllProperties;
import com.cm6123.monopoly.game.Players;
import com.cm6123.monopoly.game.Property;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PropertyChecks {
        private static final int PURCHASE_PRICE = 200;
        private static final int RENT = 20;
        private static final String OWNER = "John";



        Property testProperty= new Property("Bond Street", 3, true, 200, 20, "John");


        @Test
        public void testGetPurchasePrice() {
            assertEquals(PURCHASE_PRICE, testProperty.getPurchasePrice());
        }

        @Test
        public void testGetRent() {
            assertEquals(RENT, testProperty.getRent());
        }

        @Test
        public void testGetOwner() {
            assertEquals(OWNER, testProperty.getOwner());
        }

        @Test
        public void testSetOwner() {
            String newOwner = "Jane";
            testProperty.setOwner(newOwner);
            assertEquals(newOwner, testProperty.getOwner());
        }

    @Test
    public void testPayRent() {
        Players player = new Players("player1");
        Players owner = new Players("player2");
        Property.payRent(player, owner, 50);
        assertEquals(1050, player.getBalance());
        assertEquals(1050, owner.getBalance());
    }


        @Test
        public void testPlayerName() {
            Players[] players = new Players[] {
                    new Players("John"),
                    new Players("Jane"),
            };

            assertEquals(players[0], Property.playerName(players[0].getName(), players));
            assertEquals(players[1], Property.playerName(players[1].getName(), players));
            assertNull(Property.playerName("Nonexistent", players));
        }
    @Test
    public void testPayRentIfOwned() {
        Players player1 = new Players("Player 1");
        player1.setBalance(1500);
        Players player2 = new Players("Player 2");
        player2.setBalance(1500);
        Players[] players = { player1, player2 };
        Property property1 = new Property("Mediterranean Avenue", 1, true, 60, 2, "bank");
        Property property2 = new Property("Baltic Avenue", 3, true, 60, 4, player2.getName());
        property1.payRentIfOwned(property1, players);
        property2.payRentIfOwned(property2, players);
        assertEquals(1500, player1.getBalance());
        assertEquals(1512, player2.getBalance());
    }

}
