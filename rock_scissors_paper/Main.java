package rock_scissors_paper;

import java.util.Scanner;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner userInput = new Scanner(System.in);
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        String WHITE_BG = "\u001B[47m";
        String BLUE = "\u001B[34m";
        String CURRENT_COLOR = "";
        String[] options = { "rock", "paper", "scissors", "exit" };
        String userChoice = "";
        int score = 0;
        System.out.println(GREEN + WHITE_BG + "Welcome to Rock Scissors Paper game!\n" + RESET);

        while (true) {
            System.out.println("Choose one of the options: rock, paper, scissors");
            if (score > 0)
                CURRENT_COLOR = GREEN;
            else if (score < 0)
                CURRENT_COLOR = RED;
            else
                CURRENT_COLOR = RESET;
            System.out.println(CURRENT_COLOR + "Your Score: " + score + RESET);
            System.out.println("Write 'exit' if you want to quit the game. \n");
            System.out.print(BLUE + "Your choice: " + RESET);
            while (!Arrays.asList(options).contains(userChoice = userInput.nextLine())) {
                System.out.println(RED + "You misspelled the choice! Try again bastard!\n" + RESET);
                System.out.print(BLUE + "Your choice: " + RESET);
            }
            int randomNumber = random.nextInt(3);
            String botChoice = options[randomNumber];

            if (userChoice.equals("exit"))
                break;
            else if (botChoice.equals(userChoice))
                System.out.println(YELLOW + "Draw \n" + RESET);

            else if (userChoice.equals("rock") && botChoice.equals("scissors")
                    || userChoice.equals("paper") && botChoice.equals("rock")
                    || userChoice.equals("scissors") && botChoice.equals("paper")) {
                System.out.println(GREEN + "You won! The bot chose " + botChoice + "\n" + RESET);
                score++;
            } else {
                System.out.println(RED + "You lost. The bot chose " + botChoice + "\n" + RESET);
                score--;
            }

        }
    }
}