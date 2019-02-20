package Tuesday;

import java.util.Random;
import java.util.Scanner;

public class Arena {
	
	 // Class / Instance attributes = globally accessible
		Hero getterman = new Hero();
		Villian setterman = new Villian();
		Scanner sc = new Scanner (System.in);
		
		
		
		// Cannot access non-static attributes from a static method
		public static void main(String[] args) {
			
			Arena talkingStick = new Arena();
			talkingStick.nameCharacters();
			talkingStick.talkCatchPhrase();
			talkingStick.doBattle(talkingStick);
		}
		private void doBattle(Arena talkingStick) {
			int round = 1;
			while (getterman.getHealth () > 0 && setterman.getHealth() > 0) {
				
			talkingStick.getCharacterAction();
			talkingStick.calculateHealth();
			System.out.println( "==ROUND " + round++ + "==");
					}
			}
			
		private void calculateHealth() {
			int damage = randomGenerator(10);
			
			if(getterman.getAction()=='F')
			{	
				
				damage = randomGenerator(10);
				System.out.println(setterman.getName() + " receives damage of " + damage);
				setterman.setHealth(getterman.getHealth() - damage);
				setterman.displayHealth();
		}
			else {
				damage = randomGenerator(5);

				System.out.println(getterman.getName() + " receives healing for " + damage );
				getterman.setHealth(getterman.getHealth() + damage);
				getterman.displayHealth();
			}
		
			
			if(setterman.getAction()=='F') {
				damage =randomGenerator(10);
				
			System.out.println(getterman.getName() + " receives damage of " + damage);
			getterman.setHealth(getterman.getHealth() - damage);
			getterman.displayHealth();
			}
			else {
				damage = randomGenerator(5);
			System.out.println(setterman.getName() + " receives healing for " + damage );
			setterman.setHealth(setterman.getHealth() + damage);
			setterman.displayHealth();
		}
	}
		
		private int randomGenerator (int treshold) {
			Random rand = new Random();
			return rand.nextInt(treshold);
		}
			
		private void nameCharacters() {
			getterman.setName("Thor");
			setterman.setName("Loki");
			getterman.setHealth(randomGenerator(25)+25);
			setterman.setHealth (randomGenerator(25)+25);
			setterman.displayHealth();
			getterman.displayHealth();
			
		}
		
		private void talkCatchPhrase() {
			getterman.talk("By the power of Asgaard!");
			setterman.talk("Talking trash!");
		}
		
		
		
		private void getCharacterAction () {
			// Get the action for setterman
			System.out.println("What should " + getterman.getName() + " do?");
			System.out.println("F = fight : H = Heal");
			//Take the input as a String and convert to a char
			getterman.setAction(sc.nextLine().toUpperCase().charAt(0));
			
		
			// Get the action for setterman
			System.out.println("What should " + setterman.getName() + " do?");
			System.out.println("F = fight : H = Heal");
			setterman.setAction(sc.nextLine().toUpperCase().charAt(0));
			
			
		}
}
