package com.cm6123.monopoly;

import com.cm6123.monopoly.game.Board;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardChecks {

    private final Board board = new Board();

    @Test
    void testGetBoardLength() {
        assertEquals(16, board.getBoardLength());
    }

    @Test
    void testGetSquareName() {
        assertEquals("Home", board.getSquareName(0));
        assertEquals("Road", board.getSquareName(1));
        assertEquals("Old Kent Road", board.getSquareName(3));
        assertEquals("Park Lane", board.getSquareName(14));
    }
}
