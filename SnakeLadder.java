<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
public class SnakeLadder {
=======
import java.util.Random;

public class SnakeAndLadder {
	public static final int NO_PLAY = 1;
	public static final int LADDER = 2;
	public static final int SNAKE =3;
	public static int count = 0;
	public static Random random = new Random();
	public static int dieNum=0;
	
	public static int diePlay(int position) {
	
		int dieNum = random.nextInt(7-1)+1;
		System.out.println("Dice number : "+dieNum);

		int choice = random.nextInt(4-1)+1;

		if(choice == NO_PLAY){
			System.out.println("No Play");
		}else if(choice == LADDER) {
			System.out.println("Player inclined by "+dieNum);
			position+=dieNum;
			position = diePlay(position);
		}else if(choice == SNAKE) {
			System.out.println("Player declined by "+dieNum);
			position-=dieNum;
		}
		if(position<0)
			position = 0;
		
		if(position>100)
			position-= dieNum;
		
		count++;
		
		return position;
	}
>>>>>>> UC7-Two-Player
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Problem");
		
		int player1Pos = 0;
		int player2Pos = 0;
		
		while(player1Pos != 100 && player2Pos !=100) {
			
			System.out.println("Player 1 is playing");
			player1Pos = diePlay(player1Pos);
			System.out.println("Player 1 position : "+player1Pos);
			
			System.out.println("Player 2 is playing");
			player2Pos = diePlay(player2Pos);
			System.out.println("Player 2 position : "+player2Pos);
			
			
		}
		
		if(player1Pos == 100)
			System.out.println("Player1 wins");
		else
			System.out.println("Player2 wins");
		
		System.out.println("Die Roll count : "+count);
	}

}
=======
=======
import java.util.Random;
>>>>>>> UC2-Rolling-Die
public class SnakeLadder{
	public static void main(String[] args){
		int position=0;
		System.out.println("Welcome to snake and ladder game");
<<<<<<< HEAD
		System.out.println("Single player at position "+pos);
=======
		System.out.println("Single player is at postion "+position);
		Random random = new Random();
		int dieNum = random.nextInt(7-1)+1;
		System.out.println("Die value is "+dieNum);
		
>>>>>>> UC2-Rolling-Die
	}
}
>>>>>>> UC1-Single-Player
=======
=======
>>>>>>> UC4-Repeat
=======
>>>>>>> UC5-No-Move
=======
>>>>>>> UC6-Position-Count
import java.util.Random;

public class SnakeLadder {
	public static final int NO_PLAY = 1;
	public static final int LADDER = 2;
	public static final int SNAKE =3;

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Problem");
		

		int position = 0;
<<<<<<< HEAD
		System.out.println("Single player is at postion "+position);
		
		Random random = new Random();
<<<<<<< HEAD
		int dieNum = random.nextInt(7-1)+1;
		System.out.println("Dice number : "+dieNum);
		
		int choice = random.nextInt(4-1)+1;
		
		if(choice == NO_PLAY){
			System.out.println("No Play");
		}else if(choice == LADDER) {
			System.out.println("Player inclined by "+dieNum);
			position+=dieNum;
		}else if(choice == SNAKE) {
			System.out.println("Player declined by "+dieNum);
			position-=dieNum;
=======
		
		while(position != 100) {
			int dieNum = random.nextInt(7-1)+1;
			System.out.println("Dice number : "+dieNum);
=======
		int count = 0;
		System.out.println("Single player is at postion "+position);
		
		Random random = new Random();
		
		while(position != 100) {
				int dieNum = random.nextInt(7-1)+1;
				System.out.println("Dice number : "+dieNum);
>>>>>>> UC6-Position-Count
		
			int choice = random.nextInt(4-1)+1;
		
			if(choice == NO_PLAY){
				System.out.println("No Play");
			}else if(choice == LADDER) {
				System.out.println("Player inclined by "+dieNum);
				position+=dieNum;
			}else if(choice == SNAKE) {
				System.out.println("Player declined by "+dieNum);
				position-=dieNum;
			}
			if(position<0)
				position = 0;
			
			if(position>100)
				position-= dieNum;
<<<<<<< HEAD
		
>>>>>>> UC5-No-Move
		}
			
	}

<<<<<<< HEAD
<<<<<<< HEAD
}
>>>>>>> UC3-Option-Check
=======
}
>>>>>>> UC4-Repeat
=======
}
>>>>>>> UC5-No-Move
=======
			
			count++;
			System.out.println("Position after every die roll: "+position);
		}
		System.out.println("Final Player position is : "+position);
		System.out.println("No. of time the dice used : "+count);
	}

}
>>>>>>> UC6-Position-Count
