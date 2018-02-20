public class Player {	
	int gameType;

	public Player(int type){
		gameType = type;
	}
	
	public void gamePlay() {
		Game gameObj = new Game();
		if (gameType==1){
			System.out.println("You Chose Against Predictable Opponent");
			gameObj.predGame();
			
		}
		else if (gameType==2){
			System.out.println("You Chose Against Random Opponent");
			gameObj.randGame();
			
		}
	}
}