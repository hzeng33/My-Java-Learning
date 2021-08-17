import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int choice;
		//Remember: do_while loop always executes once.
		do {
			System.out.println("Choose an item from the list below: ");
			System.out.println("_____________________________________");
			System.out.println("1.Hot dog");
			System.out.println("2.Hamburger");
			System.out.println("3.Cheeseburger");
			System.out.println("4.Donut");
			System.out.println("5.French fries");
			choice = in.nextInt();
		}while(choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice !=5);
		
		switch(choice) {
		case 1: 
			System.out.println("You choce a hot dog, that is $1.00.");
			break;
		case 2:
			System.out.println("You chose a hamburger, that is $2.50.");
			break;
		case 3:
			System.out.println("You chose a cheeseburger, that is $3.20.");
			break;
		case 4:
			System.out.println("You chose a donut, that is $1.25.");
			break;
		case 5:
			System.out.println("You chose french fries, that is $3.50.");
			break;
		default:
			System.out.println("Have a good day!");
			break;
		}
		
		//Loan problem.
		double loanBalance = 5000;
		int months = 0;
		
		//Remember: while loop continues until some conditions is found to be false.
		while(loanBalance > 0) {
			loanBalance -=500;
			months++;
		}
		System.out.println("It will take "+months+" months to pay back your loan!");
		
		//Print all odd numbers from 1 to 100.
		System.out.println("Odd numbers between 1 to 100: ");
		for(int i=1; i<99;i++) {
			if(i%2==1) {
				System.out.print(i+", ");
			}
		}
		System.out.print("99\n");

	}

}
