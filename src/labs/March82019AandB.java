package labs;

import java.util.Scanner;

public class March82019AandB {

private static Scanner input;
		
	public static void main(String[] args) {
		input = new Scanner(System.in);

		//#1 add numbers and give correct digits
		int a=2, b=3;
		int sum = returnOneDigitSumsOnly(a, b);
		System.out.println("Test Case: SumLimit(a=" + a+", b ="+b+" added = "+sum);;
		
		int c=8, d=3;
		int sum1 = returnOneDigitSumsOnly(c, d);
		System.out.println("Test Case: SumLimit(a=" + c+", b ="+d+" added = "+sum1);;
		
		int e=8, f=1;
		int sum2 = returnOneDigitSumsOnly(e, f);
		System.out.println("Test Case: SumLimit(a=" + e+", b ="+f+" added = "+sum2);
	
	}
	
	
		//#1 of lab
		public static int returnOneDigitSumsOnly(int a, int b) {
			int sum = 0;
			int value = 0;
			value = a / 10 ;
			sum = a + b;
			if ((a/10) < (sum/10)) {
				sum = a;
			}
	
		return sum;
		}

}
