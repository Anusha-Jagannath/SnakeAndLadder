public class SnakeLadder{
	public static void main(String[] args){
		int position=0;
		System.out.println("Welcome to snake and ladder game");
		System.out.println("Single player is at postion "+position);
		int dieNum=(int)Math.floor(Math.random()*10)%6;
		System.out.println("Die value is "+dieNum);
		
	}
}