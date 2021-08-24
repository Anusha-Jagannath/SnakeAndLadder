public class SnakeLadder{
	public static final int NO_PLAY=1;
	public static final int LADDER=2;
	public static final int SNAKE=3;
	public static void main(String[] args){
		int position = 0;
		System.out.println("Welcome to snake and ladder game");	
		System.out.println("Single player is at postion "+position);
		int dieNum = (int)Math.floor(Math.random()*10)%6;
		System.out.println("Die value is "+dieNum);
		while(position!=100){
		if(dieNum!=0){
		
		int choice = (int)Math.floor(Math.random()*10)%3;
		System.out.println("Choice is "+choice);
		if(choice == NO_PLAY){
			System.out.println("No play");
		}
		else if(choice == LADDER){
			System.out.println("Player got ladder");
			System.out.println("Player moves by "+dieNum);
			position+=dieNum;
		}
		else if(choice == SNAKE){
			System.out.println("Player declined by "+dieNum);
			position-=dieNum;
		}
		if(position<0)
			position = 0;
		if(position>100)
	    }		position-=dieNum;
	}
   }
}