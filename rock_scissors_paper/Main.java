package rock_scissors_paper;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] options = { "rock", "paper", "scissors" };
        Scanner userInput = new Scanner(System.in);/*
                                                    * while (!Arrays.asList(options).contains(userInput.nextLine())) {
                                                    * userInput.nextLine();
                                                    * }
                                                    */
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int botChoice = random.nextInt(3);
            System.out.println(botChoice);
        }
    }
}