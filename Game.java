import java.util.Random;
import java.util.Scanner;

public class Game {
	int chosenAttr;
	int compAttr;
	int playerVal;
	int compVal;
	boolean finish=false;
	
	public void predGame(){
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
		compAttr = rand.nextInt(3);
		
		Attributes cardObj = new Attributes();
		
		cardObj.CardDeck();
		while (finish==false){
			
			cardObj.printPlayerCard();
			System.out.println("What Attribute Do You Want To Choose?");
			chosenAttr = sc.nextInt();
			while (chosenAttr>4 || chosenAttr<1 ){
				System.out.println("Enter Between 1 and 4");
				chosenAttr = sc.nextInt();
				continue;
			} 
			chosenAttr = chosenAttr - 1;
			playerVal = (int) (cardObj.playerDeck.peek().attributesArr[chosenAttr].getValue());
			compVal = (int) (cardObj.compDeck.peek().attributesArr[compAttr].getValue());
			
			if (playerVal>compVal){
				cardObj.playerDeck.remove();
				for(int i = 0 ; i < cardObj.compDeck.size() ; ++i) {
				  	cardObj.compDeck.add(cardObj.compDeck.poll());
				}
				System.out.println("You Won!" + "(Your:" + playerVal + " VS Computers:" + compVal + ")");
				System.out.println("You Have " + cardObj.playerDeck.size() + " Cards Left" );
				
			}
			else if (compVal>playerVal){
				cardObj.compDeck.remove();
				System.out.println("You Lost!" + "( Your " + playerVal + " VS Computers" + compVal + ")");
				System.out.println("Your Opponent Has " + cardObj.compDeck.size() + " Cards Left" );
			}
			else if (compVal==playerVal){
				System.out.println("Its a Draw!" + "( Your " + playerVal + " VS Computers" + compVal + ")");
			}
				
			if (cardObj.playerDeck.isEmpty()){
				finish=true;
				System.out.println("Congrats You Have No Cards Left! You Won!");
			}
			else if(cardObj.playerDeck.isEmpty()){
				finish=true;
				System.out.println("Sadly You Lost Better Luck Next Time");
			}
		}
		
	}
	
	public void randGame(){
		int chosenAttr;
		int compAttr;
		int playerVal;
		int compVal;
		
		Scanner sc = new Scanner(System.in);

		Attributes cardObj = new Attributes();
		
		cardObj.CardDeck();
		cardObj.printPlayerCard();
		
		
		Random rand = new Random();
		compAttr = rand.nextInt(3);
		System.out.println("What Attribute Do You Want To Choose?");
		chosenAttr = sc.nextInt();
		while (chosenAttr>4 || chosenAttr<1 ){
			System.out.println("Enter Between 1 and 4");
			chosenAttr = sc.nextInt();
			continue;
		} 
	}	
}
