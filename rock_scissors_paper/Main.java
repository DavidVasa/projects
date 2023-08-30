package rock_scissors_paper;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner userInput = new Scanner(System.in);
        String[] options = { "rock", "paper", "scissors" };
        String userChoice = "";

        System.out.println("Choose one of the options: rock, paper, scissors");
        while (!Arrays.asList(options).contains(userChoice = userInput.nextLine())) {
            System.out.println("You misspelled the choice! Try again bastard!");
        }
        int randomNumber = random.nextInt(3);
        String botChoice = options[randomNumber];

    }
}