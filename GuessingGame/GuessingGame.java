package GuessingGame;

import java.util.Scanner;

public class GuessingGame {

    public final int createRandomNumber() {
        return (int) (Math.random() * 100 + 1); // Typecast to int because Math.random returns a double
    }

    public int getUserGuess() {
        System.out.println("Guess a number between 1 and 100");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        return i;
    }

    public int getUserGuess(int i) {
        return i;
    }

}