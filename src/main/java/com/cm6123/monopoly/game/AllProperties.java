package com.cm6123.monopoly.game;

public class AllProperties {
    /** The owner of the property. */
    private String owner ;
    /** The name of the property. */

    String name;
    /** The space ID of the property on the game board. */
    private int spaceID;
    /** Whether the property is available for purchase. */
    private boolean isAvailablePurchase;

    /**
     * Constructs a new AllProperties object.
     *
     * @param lname the name of the property
     * @param lspaceID the space ID of the property on the game board
     * @param lisAvailablePurchase whether the property is available for purchase
     */

    public AllProperties(final String lname, final int lspaceID, final boolean lisAvailablePurchase) {
        this.name = lname;
        this.spaceID = lspaceID;
        this.isAvailablePurchase = lisAvailablePurchase;

    }

       /**
        * Returns the space ID of the property on the game board.
        *
        * @return the space ID of the property on the game board
        */
    public int getSpaceID() {
        return spaceID;
    }
    /**
     * Returns the name of the property.
     *
     * @return the name of the property
     */
    public String getName() {
        return name;
    }
    /**
     * Returns the owner of the property.
     *
     * @return the owner of the property
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets whether the property is available for purchase.
     *
     * @param availablePurchase whether the property is available for purchase
     */
    public void setAvailablePurchase(final boolean availablePurchase) {
        isAvailablePurchase = availablePurchase;
    }
    /**
     * Returns a string representation of the AllProperties object.
     *
     * @return a string representation of the object
     */
    public String toString() {
        return super.toString();
    }


    /**
     * Returns whether the property is available for purchase.
     *
     * @return whether the property is available for purchase
     */
    public boolean isAvailablePurchase() {
        return isAvailablePurchase;
    }
}



