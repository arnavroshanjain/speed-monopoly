package com.cm6123.monopoly;
import com.cm6123.monopoly.game.Players;
import com.cm6123.monopoly.game.Tax;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxChecks {

        @Test
        public void testTaxPayment() {
            // Create a player with a starting balance of 1000
            Players player = new Players("Player1");

            // Test with dice rolls of 2 and 2
            Tax.taxPayment(2, 2, player.getBalance(), player);
            assertEquals(900, player.getBalance());

            // Test with dice rolls of 3 and 4
            Tax.taxPayment(3, 4, player.getBalance(), player);
            assertEquals(855, player.getBalance());
        }


    @Test
    public void testConstructor() {
        Tax taxTest = new Tax("Income Tax", 4, false);
        assertEquals("Income Tax", taxTest.getName());
        assertEquals(4, taxTest.getSpaceID());
    }

    }

