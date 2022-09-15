package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("What is your starting amount?");
		int startingAmount = in.nextInt();

		System.out.println("What is your win chance?");
		double winChance = in.nextDouble();

		System.out.println("What is your win limit?");
		int winLimit = in.nextInt();

		System.out.println("How many days will you simulate?");
		int totalSimulations = in.nextInt();

		for (int days = 0; days <= totalSimulations; days++) {
			int money = startingAmount;
			int numberOfPlays = 0;
			System.out.println("Day " + days);
			//will play until you hit max number of days 
			while (money>0 && money < winLimit) {
				numberOfPlays++;
				if (Math.random() <= winChance) {
					money += 1;
				}
				else {
					money -= 1;
				}
			}
			System.out.println("The number of plays is " + numberOfPlays);
			if (money ==0) {
				System.out.println("You lose!!");
			}
			else {
				System.out.println("You win!");
			}
		}
	}

}


