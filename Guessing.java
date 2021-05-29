import java.util.Random;
import java.util.Scanner;
public class Guessing {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int tempStop = 0;
		int guess = 0;
		int stop = 0;
		int easyIntToGuess = rand.nextInt(100) + 1;
		int hardIntToGuess = rand.nextInt(1000) + 1;
		int randCheck1 = rand.nextInt() + 1000;
		int randCheck2 = rand.nextInt() + 1000;
		int randCheck3 = rand.nextInt() + 1000;
		int randCheck4 = rand.nextInt() + 1000;
		int difficulty = 0;
		int numberOfGuesses = 0;
		char askAgain = 'Y';
		while(askAgain == 'Y'){
		System.out.println("Welcome to Hi-Lo!");	
		System.out.println("1) Easy (Guesses a number between 1 and 100)");
		System.out.println("2) Hard (Guesses a number between 1 and 1,000)");
		System.out.print("Select your level of difficulty (1/2): ");
		difficulty = sc.nextInt();
		if(difficulty == 1){
			while(guess != easyIntToGuess || guess == randCheck1){
				tempStop = 0;
				System.out.print("Guess an integer between 1 and 100, or type '101' to quit: ");
				guess = sc.nextInt();
				numberOfGuesses++;
				while(guess != 0){
					if(guess == 101){
						System.out.println("You have quit the game.");
						System.out.print("Would you like to play again? (Y/N): ");
						askAgain = sc.next().charAt(0);
							if(askAgain == 'N'){
								guess = randCheck2;
								System.out.println("Game successfully terminated.");
							}
							else if(askAgain == 'Y'){
								numberOfGuesses = 0;
								easyIntToGuess = rand.nextInt(100) + 1;
								guess = randCheck1;
							}
				}
				while(guess > 101 && guess != randCheck2 || guess < 0 && stop != 1){
					if(guess != randCheck1){
						System.out.println("The guess " + guess + " is out of range. Try guessing a number between 1 and 100. ");
					}
						System.out.print("Guess an integer between 1 and 100, or type '101' to quit: ");
						guess = sc.nextInt();
						numberOfGuesses++;
				}
				if(guess == easyIntToGuess){
					tempStop = 1;
					System.out.println("Congrats, you have guessed the number in " + numberOfGuesses + " guesses.");
					System.out.print("Would you like to play again? (Y/N): ");
					askAgain = sc.next().charAt(0);
						if(askAgain == 'N'){
							stop = 1;
							guess = randCheck2;
							System.out.println("Game successfully terminated.");
							sc.close();
						}
						else if(askAgain == 'Y'){
							guess = randCheck1;
							easyIntToGuess = rand.nextInt(100) + 1;
							numberOfGuesses = 0;
						}
					}
					while(guess > easyIntToGuess && guess != randCheck2 && guess != 101 && guess < 101 && stop != 1){
						if(guess != randCheck1){
							System.out.println("The guessed integer " + guess + " is high.");
						}
						System.out.print("Guess an integer between 1 and 100, or type '101' to quit: ");
						guess = sc.nextInt();
						numberOfGuesses++;
					}
					while(guess < easyIntToGuess && stop != 1){
						
							System.out.println("The guessed integer " + guess + " is low.");
						
							System.out.print("Guess an integer, or type '101' to quit: ");
							guess = sc.nextInt();
							numberOfGuesses++;
						}
					}
				}
			}
		else if(difficulty == 2){
			while(guess != hardIntToGuess || guess == randCheck3){
				tempStop = 0;
				System.out.print("Guess an integer between 1 and 1000, or type '1001' to quit: ");
				guess = sc.nextInt();
				numberOfGuesses++;
				while(guess != 0){
					if(guess == 1001){
						System.out.println("You have quit the game.");
						System.out.print("Would you like to play again? (Y/N): ");
						askAgain = sc.next().charAt(0);
							if(askAgain == 'N'){
								stop = 1;
								guess = randCheck4;
								System.out.println("Game successfully terminated.");
							}
							else if(askAgain == 'Y'){
								numberOfGuesses = 0;
								hardIntToGuess = rand.nextInt(1000) + 1;
								guess = randCheck3;
							}
				}
				while(guess > 1001 && guess != randCheck4 || guess < 0 && stop != 1){
					if(guess != randCheck3){
						System.out.println("The guess " + guess + " is out of range. Try guessing a number between 1 and 1000. ");
					}
						System.out.print("Guess an integer between 1 and 1000, or type '1001' to quit: ");
						guess = sc.nextInt();
						numberOfGuesses++;
				}
				if(guess == hardIntToGuess){
					tempStop = 1;
					System.out.println("Congrats, you have guessed the number in " + numberOfGuesses + " guesses.");
					System.out.print("Would you like to play again? (Y/N): ");
					askAgain = sc.next().charAt(0);
						if(askAgain == 'N'){
							stop = 1;
							guess = randCheck4;
							System.out.println("Game successfully terminated.");
							sc.close();
						}
						else if(askAgain == 'Y'){
							guess = randCheck3;
							hardIntToGuess = rand.nextInt(1000) + 1;
							numberOfGuesses = 0;
							break;
						}
					}
					while(guess > hardIntToGuess && guess != randCheck4 && guess != 1001 && guess < 1001 && stop != 1){
						if(guess != randCheck3){
							System.out.println("The guessed integer " + guess + " is high.");
						}
						System.out.print("Guess an integer between 1 and 1000, or type '1001' to quit: ");
						guess = sc.nextInt();
						numberOfGuesses++;
					}
					while(guess < hardIntToGuess && stop != 1){
						if(guess != randCheck3){
							System.out.println("The guessed integer " + guess + " is low.");
						}
							System.out.print("Guess an integer, or type '1001' to quit: ");
							guess = sc.nextInt();
							numberOfGuesses++;
						}
					}
				}
			}
		else{
			System.out.println("Sorry, but " + difficulty + " is not a valid option. Only 1 and 2 are valid options, try again.");
			//This is a debug script. Does nothing but keep the code intact.
			}
		}
		sc.close();
	}
}