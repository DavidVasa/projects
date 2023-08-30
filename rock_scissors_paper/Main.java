package rock_scissors_paper;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        String[] options = { "rock", "paper", "scissors" };
        String userChoice = "";

        Scanner userInput = new Scanner(System.in);
        while (!Arrays.asList(options).contains(userChoice=userInput.nextLine())) {
            userInput.nextLine();
        userChoice = userInput;
        }
        int randomNumber = random.nextInt(3);
        String botChoice = options[randomNumber];

        if ()

    }
}