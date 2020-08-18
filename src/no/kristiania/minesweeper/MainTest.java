package no.kristiania.minesweeper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void itShouldDisplayMine() {
        assertEquals("*", displayBoard("*"));
    }

    private String displayBoard(String s) {
        return null;
    }
}
