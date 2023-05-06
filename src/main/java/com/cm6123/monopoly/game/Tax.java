package com.cm6123.monopoly.game;

public class Tax extends AllProperties {
    boolean rolledDouble;

    public Tax(String name, int spaceID, boolean isAvaliablePurchase, boolean rolledDouble) {
        super(name, spaceID, false);
        this.rolledDouble = false;

    }


    public void setRolledDouble(boolean rolledDouble) {
        this.rolledDouble = rolledDouble;
    }

}




