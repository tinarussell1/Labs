package labs;

import java.util.Scanner;

public class March82019RepeatString {

private static Scanner input;
			
	public static void main(String[] args) {
		input = new Scanner(System.in);

		//#5 repeat string into one string
		
		String[] arr = {"Hi,2", "Hi,3","Hi,1" };
		
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<1;j++) {
				String[] arg =arr[i].split(",");
				int number = Integer.parseInt(arg[1]);
				String str2 = newString(arg[0], number);
				System.out.println(str2);
			}
		}	

	}
		
		
	//#5 repeat string into one string
	public static String newString(String str, int number) {
		String string2="";
		for (int i=0;i<number;i++) {
			string2 = string2 +str;
		}
		
		return string2;
	}

}
