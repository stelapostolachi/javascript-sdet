
public class CalculateScore {

	public static void main(String[] args) {
		
		int newScore=calculateScore("Mike", 5000);
		System.out.println("New score is: "+newScore);
		
		calculateScore(75);
		calculateScore();
		

	}
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player "+ playerName+" Score "+score+" points.");
		return score*100;
	}
	public static int calculateScore(int score) {
		System.out.println("Unnamed Player Score "+score+" points");
		return score*100;
	}
	public static void calculateScore() {
		System.out.println("No player Name, No player score.");
	}

}
