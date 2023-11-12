import java.util. Random;

import java.util.Scanner;

public class GuessingGame {

public static void main(String[] args) {

Random rand = new Random();

int number ToGuess = rand.nextInt(1000);

int numberOfTries = 0;

Scanner input = new Scanner(System.in);

int guess;

System.out.println("Guess a number between 1 and 1000: "); numberOfTries++;

guess input.nextInt();

if (guess == numberToGuess) {

}
else if (guess < numberToGuess) { System.out.println("Your guess is too low");

}

else if (guess > numberToGuess) { System.out.println("Your guess is too high"); 
}
}