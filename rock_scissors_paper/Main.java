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
        int randomNumber = random.nextInt(1);
        String botChoice = options[randomNumber];


if (botChoice.equals(userChoice)) System.out.println("Draw");

else if (userChoice.equals("rock")&&botChoice.equals("scissors") || userChoice.equals("paper")&&botChoice.equals("rock") || userChoice.equals("scissors")&&botChoice.equals("paper")) 
system.out.println("You won!");

else system.out.println("You lost. The bot chose" + botChoice);
    }
}