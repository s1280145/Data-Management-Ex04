import java.util.Random;

public class Dice{
	public static void main(String[] args) {
		Random rand = new Random();

		System.out.println("Rolling the dice...");
		int D1,D2,Total;

		D1 = rand.nextInt(6)+1;
		D2 = rand.nextInt(6)+1;
		Total = D1+D2;
		System.out.println("Dice 1: " + D1);
		System.out.println("Dice 2: " + D2);
		System.out.println("Total value: " + Total);

		if(Total>7) {
			System.out.println("You won");
		}else {
			System.out.println("You lost");
		}
	}
}
