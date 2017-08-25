import java.util.Scanner;
public class GuessingGame {
//by jaron hutton
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);
		
		boolean x = true;
		while (x=true) //loop for game
		{
				System.out.println("Welcome to my guessing game! Enter the maximum guessing number you'd like!"); //original choice for maximum guess
			
				int max = cin.nextInt(); //setting max number
				System.out.println("Alright buddy, enter your guess from 1-" + max );
					
				int random = (int)(1 + max*Math.random()); //math for random number
				
				boolean n = true;
				while (n=true) //loop for guesses
				{
					int guess = cin.nextInt();
					
					if (guess<random)
					{
						System.out.println("Too low!");
					}
					else if(guess>random)
					{
						System.out.println("Too high!");
					}
					else if(guess==random)
					{
						System.out.println("Perfect! Would you like to play again? Yes or no?"); //asking to play again
						String replay = cin.next(); //string for replay value
					
						if (replay.equals("yes")) //replay
						{
							System.out.println("Alright, let's go again");
							break; //sends back to beginning of game loop
						}
						else
						{
							System.out.println("Thanks for playing my game!"); //exit
							System.exit(0); //kills program
						}
					}
				}
		}
	}
}
