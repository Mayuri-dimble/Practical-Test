package Question2;
import java.util.Scanner;
public class GameMenu {

	void startGame() {
		System.out.println("Start the game");
	}
	void displayGameInsrtuction() {
		System.out.println("display the game");
	}
	void exitGame() {
		System.out.println("exit game");
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	GameMenu gamemenuobj=new GameMenu();
	System.out.println("1. Start the game");
	System.out.println("2. display the game");
	System.out.println("3. Exit game");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your choice");
		int menuchoice=sc.nextInt();
		
		switch(menuchoice) {
		
		case 1:
			System.out.println(" Start the Game");
		break;
		
		case 2:
			System.out.println(" Display Game Instruction");
		break;
		
		case 3:
			System.out.println(" Exit Game");
		break;
		
	 default:
			System.out.println("default");
		break;
		} 
	

}

}
