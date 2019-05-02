package labs;

import java.util.Scanner;

public class March82019LotteryWinnings {

private static Scanner input;
		
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		//#3 green lottery ticket
		int[] ticket = new int[]{1, 2, 3};
		int winnings = checkNumbers(ticket);
		System.out.println("Ticket numbers, winnings: "+ticket[0] +" "+ticket[1] +" "+ticket[2] +", "+winnings);
		
		int[] ticket2 = new int[]{2,2,2};
		int winnings2 = checkNumbers(ticket2);
		System.out.println("Ticket numbers, winnings: "+ticket2[0] +" "+ticket2[1] +" "+ticket2[2] +", "+winnings2);
		
		int[] ticket3 = new int[]{1,1,2};
		int winnings3 = checkNumbers(ticket3);
		System.out.println("Ticket numbers, winnings: "+ticket3[0] +" "+ticket3[1] +" "+ticket3[2] +", "+winnings3);
	}

	//#3 lottery winnings 
	public static int checkNumbers(int[] ticket) {
		int a = ticket[0];
		int b = ticket[1];
		int c = ticket[2];
			
		int win = 0;
						
		if ((a == b) && (a==c)) {
			win = 20;
		} else if  ((a == b) || (a==c)) {
			win = 10;	
		} else {
			win = 0;
		}
		return win;
	}	
	
}
