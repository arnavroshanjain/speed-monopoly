package com.cm6123.monopoly;
import com.cm6123.monopoly.game.AllProperties;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AllPropertiesChecks {
    AllProperties testProperty=  new AllProperties("Oxford Street", 39, true);
    @Test
    public void testGetSpaceID() {
        assertEquals(39, testProperty.getSpaceID());
    }

    @Test
    public void testGetName() {
        assertEquals("Oxford Street", testProperty.getName());
    }

    @Test
    public void testGetOwner() {
        assertNull(testProperty.getOwner());
    }

    @Test
    public void testSetAvailablePurchase() {
        testProperty.setAvailablePurchase(false);
        assertFalse(testProperty.isAvailablePurchase());
    }

    @Test
    public void testIsAvailablePurchase() {
        assertTrue(testProperty.isAvailablePurchase());
    }

    @Test
    public void testToString() {
        assertNotNull(testProperty.toString());
    }

}



