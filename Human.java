import java.util.*;

public class Human {	
	private static String name = ("");
	private static int gameType;
		
	public void GameSetup(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		name = sc.next();
		System.out.println("Hi " + name);
		System.out.println("Want To Play Against");
		System.out.println("1. Predictable?");
		System.out.println("2. Random?");
		gameType = sc.nextInt();
		while (gameType>2 || gameType<1 ){
			System.out.println("1 or 2");
			gameType = sc.nextInt();
			continue;
		}
		Player playerobj = new Player(gameType);
		playerobj.gamePlay();
		
	}
}