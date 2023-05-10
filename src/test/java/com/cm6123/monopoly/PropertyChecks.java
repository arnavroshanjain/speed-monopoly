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
        public void testPlayerName() {
            Players[] players = new Players[] {
                    new Players("John"),
                    new Players("Jane"),
            };

            assertEquals(players[0], Property.playerName(players[0].getName(), players));
            assertEquals(players[1], Property.playerName(players[1].getName(), players));
            assertNull(Property.playerName("Nonexistent", players));
        }
}
