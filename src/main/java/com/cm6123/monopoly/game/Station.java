package com.cm6123.monopoly.game;

public class Station extends AllProperties{
    boolean rolledDouble;

    public Station(String name, int spaceID, boolean rolledDouble) {
        super(name, spaceID, false);
        this.rolledDouble = false;
    }

    public boolean getRolledDouble() {
        return rolledDouble;
    }

    public void setRolledDouble(boolean rolledDouble) {
        this.rolledDouble = rolledDouble;
    }
}

