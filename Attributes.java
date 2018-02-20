import java.util.*;
/**The Attributes Class.
 * Holds the name and value of the attributes.
 * Adds the cards to the decks.
 * */
public class Attributes {
	//Creates the arrays and the attributes. also the array to store the attributes for each card
	private static String[] cardTitleArray = {"David Bowie", "Justin Beiber", "Mumford and Sons", "George Ezra" ,"Calvin Harris" , "Micheal Jackson" , "Bob Marley" , "Bon Jovi", "Katy Perry", "Kanye West", "Kendrick Lamar", "Bon Iver", "Drake", "Skepta", "Notorious B.I.G", "MGMT", "Fetty Wap", "Stormzy", "Prince", "Artic Monkeys", "Gorillaz", "Coldplay"};
	private static String[] attrTitleArray = {"Popularity","Fist Pumps","Chill Factor" , "Sesh Pleaser"};
	int[] attrValArr = new int [4]; 	
	
	//Creates the Deck queues for player and computer.
	Queue<Card> compDeck = new LinkedList<Card>();
	Queue<Card> playerDeck = new LinkedList<Card>();

	/**CardDeck method creates the cards and splits it into a player deck and a computer deck.
	 * Creates a random value for each attribute and links the attributes to a card name
	 * Then 
	 * 
	 * */ 
	public void CardDeck(){
		boolean switchDeck = true; 
		for (int i = 0; i < cardTitleArray.length; i++){
			for (int j = 0; j < attrTitleArray.length; j++) {
				Random rand = new Random();
				attrValArr[j] = rand.nextInt(9);
			}
			//Creates 1 Card with the attributes attached
			Card card = new Card(cardTitleArray[i], attrTitleArray, attrValArr);
			//
			if (switchDeck==true){
				this.playerDeck.add(card);
				switchDeck=false;
			}
			else if(switchDeck==false){
				this.compDeck.add(card);
				switchDeck=true;
			}
		} 
	}
	
	
	public void printPlayerCard(){
		System.out.println("\n" + "Your Card:");
		System.out.println(playerDeck.peek().getCardName() + "\n----------");
		for(int j =0; j < 4; j++){
			System.out.println((j+1) + "." + playerDeck.peek().attributesArr[j].getName() + ": " + playerDeck.peek().attributesArr[j].getValue());
		}
		System.out.println("\n");
	}
	
	public void printCompCard(){
		System.out.println("\n" + compDeck.peek().getCardName() + "\n----------");
		for(int j =0; j < 4; j++){
			System.out.println(compDeck.peek().attributesArr[j].getName() + ": " + compDeck.peek().attributesArr[j].getValue());
		}
		System.out.println("\n");
	}
}	
