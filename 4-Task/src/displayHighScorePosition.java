
public class displayHighScorePosition {

	public static void main(String[] args) {
		
		
		
		int position = calculateHighScorePosition(300);
		displayHighScorePosition("Stela",position);
		
	    position = calculateHighScorePosition(400);
		displayHighScorePosition("Katy",position);
		
		
		displayHighScorePosition("Vio",calculateHighScorePosition(200000));

	}
	
	public static void  displayHighScorePosition(String players, int position) {
		System.out.println(players+" managed to get into position "+position+" on the high score table.");
	}
	
	public static int calculateHighScorePosition(int score) {
		if(score>=1000) {
			return 1;
		}else if(score>=500 && score<1000) {
			return 2;
		}else if(score>100 && score<500) {
			return 3;
		}else {
			return 4;
		}
		
	}

}
