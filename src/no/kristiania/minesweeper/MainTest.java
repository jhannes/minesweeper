package no.kristiania.minesweeper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void itShouldDisplayMine() {
        assertEquals("*", displayBoard("*"));
    }

    @Test
    void itShouldDisplayEmptyCell() {
        assertEquals("0", displayBoard("."));
    }

    @Test
    void itShouldDisplayEmptyCells() {
        assertEquals("000", displayBoard("..."));
    }

    private String displayBoard(String s) {
        String board = "*";
        if(s.equals(".")) {
            board = "0";
        }
        return board;
    }
}
