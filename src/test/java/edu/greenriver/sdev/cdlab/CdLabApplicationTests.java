package edu.greenriver.sdev.cdlab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CdLabApplicationTests {

    private final int SIDES = 6;
    private final String COLOR = "White";
    private Dice dice;

    @BeforeEach()
    void init() {
        dice = new Dice(SIDES, COLOR);
    }

    @Test
    void testSides() {
        assertEquals(dice.getSides(), SIDES);
    }

    @Test
    void testColor() {
        assertEquals(dice.getColor(), COLOR);
    }

    @Test
    void testRollDice() {
        int roll = -1;
        while (roll != 3) {
            roll = dice.roll();
        }
        assertEquals(roll, 3);
    }

    @Test
    void testRollMany() {
        int rollAmount = 10;
        int[] history = dice.rollMany(rollAmount);
        assertEquals(rollAmount, history.length);
    }

    @Test
    void testToString() {
        String actual = "A " + SIDES + " sided die";
        assertEquals(dice.toString(), actual);
    }

}
