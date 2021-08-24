import java.util.Random;
public class SnakeLadder{
	public static void main(String[] args){
		int position=0;
		System.out.println("Welcome to snake and ladder game");
		System.out.println("Single player is at postion "+position);
		Random random = new Random();
		int dieNum = random.nextInt(7-1)+1;
		System.out.println("Die value is "+dieNum);
		
	}
}