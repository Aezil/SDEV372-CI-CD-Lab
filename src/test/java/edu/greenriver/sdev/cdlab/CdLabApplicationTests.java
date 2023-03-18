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
        System.out.println("Running testSides");
        assertEquals(dice.getSides(), 11);
        System.out.println("Finished running testSides");
    }

    @Test
    void testColor() {
        System.out.println("Running testColor");
        assertEquals(dice.getColor(), COLOR);
        System.out.println("Finished running testColor");
    }

    @Test
    void testRollDice() {
        System.out.println("Running testRollDice");
        int roll = -1;
        while (roll != 3) {
            roll = dice.roll();
        }
        assertEquals(roll, 3);
        System.out.println("Finished running testRollDice");
    }

    @Test
    void testRollMany() {
        System.out.println("Running testRollMany");
        int rollAmount = 10;
        int[] history = dice.rollMany(rollAmount);
        assertEquals(25, history.length);
        System.out.println("Finished running testRollMany");
    }

    @Test
    void testToString() {
        System.out.println("Running testToString");
        String actual = "A " + SIDES + " sided die";
        assertEquals(dice.toString(), actual);
        System.out.println("Finished running testToString");
    }

}
