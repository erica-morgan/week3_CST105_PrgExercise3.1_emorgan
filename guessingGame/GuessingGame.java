package guessingGame;

/**
 * Program: Guessing Game
 * File: GuessingGame.java
 * Summary: A game where the user tries to guess a number between 1 and 10,000.
 * Author: Erica Morgan
 * Date: 03/09/2018
 */
import java.util.Scanner;
import java.math.*;

public class GuessingGame {

	public static void main(String[] args) {
		// Enter a random number
		int randomNumber = (int) (Math.random() * 10000);
		// Keep track of user guesses
		int numberOfTries = 0;
		// Introduce the game
		System.out.println("Welcome to The Guessing Game!");
		// Create the Scanner object
		Scanner input = new Scanner(System.in);
		int userGuess;
		// User input field
		// Create a variable to keep the while loop open boolean win = false
		// Makes the game repeat until the user wins
		boolean win = false;
		// Initialize variables for user feedback in the loop
		int maxGuess = 10000;
		int minGuess = 1;
		int userGuessLow = minGuess;
		int userGuessHigh = maxGuess;
		// Begin Game
		// Start the loop
		System.out.println("Please enter a number from " + minGuess + " - " + maxGuess + ": ");
		while (win == false) {
			userGuess = input.nextInt();
			numberOfTries++;
			// Correct Guess
			if (userGuess == randomNumber) {
				win = true;
			}
			// Guess too low
			else if (userGuess < randomNumber) {
				userGuess = userGuessLow;
				System.out.println("Higher");
				System.out.println("Please guess a number between " + minGuess + " - " + maxGuess + ": ");
			} else if (userGuess > randomNumber) {
				userGuess = userGuessHigh;
				System.out.println("Lower");
				System.out.println("Guess a number between " + minGuess + " - " + maxGuess + ":");
			}
		}
		System.out.println("You Win!");
		System.out.println("The number to guess was " + randomNumber);
		System.out.println("It took you " + numberOfTries + " tries.");

	}
}
