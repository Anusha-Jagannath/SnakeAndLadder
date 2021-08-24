public class SnakeLadder{
	public static final int NO_PLAY = 1;
	public static final int LADDER = 2;
	public static final int SNAKE =3;

	public static void main(String[] args){
		int position = 0;
		System.out.println("Welcome to snake and ladder game");
		System.out.println("Single player is at postion "+position);

		while(position!=100){
		int dieNum=(int)Math.floor(Math.random()*10)%6;
		if(dieNum!=0){
		System.out.println("Dice number : "+dieNum);
		int choice=(int)Math.floor(Math.random()*10)%3;
		if(choice == NO_PLAY){
			System.out.println("No Play");
		}
		else if(choice == LADDER) {
			System.out.println("Player inclined by "+dieNum);
			position+=dieNum;
		}
		else if(choice == SNAKE) {
			System.out.println("Player declined by "+dieNum);
			position-=dieNum;
		}
		if(position<0)
			position = 0;

	 
             }
	}
		


    }
}