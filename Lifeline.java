
import java.util.Scanner;
public class Lifeline {

	public static void main(String[] args) {
		System.out.println("Welcome to the Game!");
		System.out.println("You will given a series of two choices");
		System.out.println("Choose wisely as the fate of\n[insert your favorite fictional realm here] depends on it");
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("First Question: ");
		System.out.println("You see a spider, do you: ");
		System.out.println("1: Run away");
		System.out.println("2: Kill it");
		System.out.println("3: Set it on fire"); 
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		
		if (n == 1){
			System.out.println("Coward. But it looks like you ran directly into a princess.");
			System.out.println("Do you: ");
			System.out.println("1: Apologize and ask her out for a drink");
			System.out.println("2: Pick her up from the ground and start waltzing with her");
			System.out.println("3: Run because you were embrassed");
			n = reader.nextInt();
			
			if (n == 1){
				System.out.println("She said yes. She likes coffee.");
				System.out.println("Do you: ");
				System.out.println("1: Take her to a starbucks.");
				System.out.println("2: Take her to a charming local coffee shop.");
				System.out.println("3: Make her french press coffee in the royal kitchen.");
				n = reader.nextInt();
				
				if(n == 1){
					System.out.println("You managed to get comfy chairs and two grande peppermint frappacinos");
					System.out.println("Do you: ");
					System.out.println("1: Talk about the kingdom poltics. (It is a coffee shop after all)");
					System.out.println("2: Talk about books");
					System.out.println("3: Talk about your travels");
					n = reader.nextInt();
					
					if (n == 1){
						System.out.println("Bad move: Looks like you lost your chance to be part of the royal family or board of advisors");
					}
					
					if(n == 2){
						System.out.println("See appointed you as the royal librarian. After many dates, you eventually became her significant other.");
					}
					
					if (n == 3){
						System.out.println("The King heard of your travels, and asked you to take his daughter on a study abroad. Her trip helped her become a better queen and she wrote a nice book about your adventures.");
					}
				}
				if (n == 2){
					System.out.println("Great Choice. You went to one that over looks the river.");
					System.out.println("Do you: "); 
					System.out.println("1: Show off your knowledge to impress her");
					System.out.println("2: Look and talk about all the sweets in the shop");
					System.out.println("3: Play Scrabble");
					n = reader.nextInt();
				
					if (n == 1){
						System.out.println("Not the Best Idea. Turns out that she is studying electrical engineering. She is way smart, so she helped you get into your dream school");
					}
				
					if(n == 2){
						System.out.println("Good Idea. You and the princess decide to organize a local sweets festival where the local economy improved and important foriegn people attended");
					}
				
					if (n == 3){
						System.out.println("You crushed the princess at Scrabble. She's very sad, and you may have lost your chance at being part of the kingdom.");
					}
				}
			
			if (n == 3){
				System.out.println("She loves your coffee. She appoints you to be the royal chef where you stopped numerous poisions and impressed foreign officals.");
				}
			}
			
		}
			
		if ( n == 2){
			System.out.println("That was sweet and clever.");
			System.out.println("Do you: ");
			System.out.println("1: Introduce yourself as a traveling dancer who had business in the castle");
			System.out.println("2: Bow and leave");
			n = reader.nextInt();
			if (n == 1){
				System.out.println("The princess is very confused and asked if you were giving a performance sometime today.");
				System.out.println("Do you: ");
				System.out.println("1: Tell her you aren't a performer");
				System.out.println("2: Tell her that you were trying to find a way to start your own studio/gym");
				n = reader.nextInt();
				
				if (n == 1){
					System.out.println("The princess is very disappointed, and helps you find your way back home.");
				}
				
				if (n == 2){
					System.out.println("She loves the idea, so she gave you a small loan and permission to build the studio. The studio helps the arts flourish which made tourism flourish in response. ");
				}
			}
			
			if (n == 2){
				System.out.println("The princess refuse to marry anyone because she wanted to see you again. So the royal blood line died out.");
			}
		}
			
		if (n == 3){
			System.out.println("This isn't a manga or Cinderlla. So that's the end of your story");
		}
		
	if (n == 2){
		System.out.println("You're braver than most. Your mentor saw this and gave you an assignment to kill a dragon.");
		System.out.println("Do you: "); 
		System.out.println("1: Kill the Dragon"); 
		System.out.println("2: Capture the Dragon"); 
		n = reader.nextInt();
			
		if (n == 1){
			System.out.println("Good job. Now you must bring proof of your kill.");
			System.out.println("Do you: ");
			System.out.println("1: Take one of its teeth");
			System.out.println("2: Take one of its claws");
			System.out.println("3: Take a vial of its blood");
			n = reader.nextInt();
				
			if(n == 1){
				System.out.println("That must have been hard."); 
				System.out.println("What are you going to do with the tooth: "); 
				System.out.println("1: Turn it into a necklace"); 
				System.out.println("2: Turn it into a dagger"); 
				n = reader.nextInt(); 
					
				if (n == 1){
					System.out.println("Good choice. The necklace later became part of peace deal between two kingdoms.");
				}
					
				if (n == 2){
					System.out.println("Your mentor betrayed you and took credit for the dagger.");
				}
			}
				
			if (n == 2){
				System.out.println("What do you do with the claw:");
				System.out.println("1: Turn it into a sword");
				System.out.println("2: Sell it for money");
				System.out.println("3: Turn it into a statue");
				n = reader.nextInt(); 
				if (n == 1){
					System.out.println("You impressed your mentor and king noticed. You became the captain of the guard.");
				}
					
				if (n == 2){
					System.out.println("Okay. I guess thats the end of the adventure then");
				}
					
				if (n == 3){
					System.out.println("Your town became famous for the dragon slayer and dragon claw statue");
				}	
			}
				
			if(n == 3){
				System.out.println("The vial blood has magical properties. You give it the healer who helped the people and land become stronger");
				}
			}
			
			if (n == 2){
				System.out.println("I guess you wanted to be a dragon rider or dragon tamer. Good luck training the dragon."); 
			}
		}
		if (n == 3){
			System.out.println("That's a bit overkill. Looks like part of an very important book got ruined, so you got banished.");
		}
	}

}
