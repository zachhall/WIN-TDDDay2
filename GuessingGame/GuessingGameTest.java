package GuessingGame;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GuessingGameTest {
    
    @Test
    public final void testIfRandomNumberIsBetween1And100() {
        GuessingGame guessingGame = new GuessingGame();
        int num = guessingGame.createRandomNumber();
        assertTrue(num < 100 && num > 1);
    }

    @Test
    public final void testIfUserGuessIsBetween1And100() {
        GuessingGame guessingGame = new GuessingGame();
        int i = guessingGame.getUserGuess(66);
        assertTrue(i < 100 && i > 1);
    }
}