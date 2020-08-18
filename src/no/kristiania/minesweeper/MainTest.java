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

    @Test
    void itShouldDisplayMoreRows() {
        assertEquals("000\n000", displayBoard("...\n..."));
    }

    private String displayBoard(String s) {
        String board = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                board += "*";
            } else {
                board += "0";
            }
        }

        return board;
    }
}
