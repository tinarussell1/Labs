package labs;

import java.util.Scanner;

public class March82019SquirrelsPlay {


private static Scanner input;
		
	public static void main(String[] args) {
		input = new Scanner(System.in);
	
		//#2 squirels play in temps 60 to 90, and if summer between 60 and 100
		int temperature =70;
		boolean summer = false;
		boolean play = squirrelsPlay(temperature, summer);
		System.out.println("Temperature, Do squirrels play? "+temperature +", "+play);
		
		int temperature2 =95;
		boolean summer2 = false;
		boolean play2 = squirrelsPlay(temperature2, summer2);
		System.out.println("Temperature, Do squirrels play? "+temperature2 +", "+play2);
	
		int temperature3 =95;
		boolean summer3 = true;
		boolean play3 = squirrelsPlay(temperature3, summer3);
		System.out.println("Temperature, Do squirrels play? "+temperature3 +", "+play3);
	}
		
	//#2 squirrels play
	public static boolean squirrelsPlay(int temp, boolean summer) {
		int sum = 0;
		int min = 60;
		int max = 90;
		int summerMax = 100;
		boolean play=false;
					
		if (summer) {
			if ((temp < summerMax) && (temp > min)) {
				play = true;
			}
		}
		else {
			if ((temp < max) && (temp > min)) {
				play = true;
			}
		}
		return play;
	}		

}
