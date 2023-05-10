package com.cm6123.monopoly;

import com.cm6123.monopoly.game.Players;
import com.cm6123.monopoly.game.Station;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StationChecks {

    @Test
    public void testStationTicket() {
        Players player = new Players("Bart");
        Station.stationTicket(5, player);
        assertEquals(950, player.getBalance());
    }
}
