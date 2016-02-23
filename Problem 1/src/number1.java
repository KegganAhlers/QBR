import java.util.Scanner;
public class number1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Amount of touchdowns: ");
		double Touchdowns = input.nextDouble();
		System.out.print("Amount of Yards: ");
		double Yards = input.nextDouble();
		System.out.print("Amount of INTs: ");
		double ints = input.nextDouble();
		System.out.print("Amount of Completions: ");
		double comps = input.nextDouble();
		System.out.print("Amount of Passes Attempted: ");
		double passes = input.nextDouble();
		double eq1 = ((comps/passes) - .3) * 5;
		double eq2 = ((Yards/passes)-3) * .25;
		double eq3 = ((Touchdowns/passes) * 20);
		double eq4 = (2.375-((ints/passes) * 25));
		double pRating = ((eq1 + eq2 + eq3 + eq4)/6) * 100;
		System.out.print("The passer rating is " + pRating);


		
		

	}

}
