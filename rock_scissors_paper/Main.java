package rock_scissors_paper;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        String[] options = { "rock", "paper", "scissors" };
        Scanner userInput = new Scanner(System.in);
        while (!Arrays.asList(options).contains(userInput.nextLine())) {
            userInput.nextLine();
        }

        int randomNumber = random.nextInt(3);
        String botChoice = options[randomNumber];

    }
}