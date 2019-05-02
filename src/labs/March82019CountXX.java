package labs;

import java.util.Scanner;

public class March82019CountXX {

private static Scanner input;
		
	public static void main(String[] args) {
		
		input = new Scanner(System.in);

		//#4 count "XX" in string
		String[] str = {"abcxx", "xxx", "xxxx" };
		for (int i =0;i<str.length;i++) {
		int howMany = countXs(str[i]);
		System.out.println("Count XX: "+str[i] +", "+howMany);
		}
	
	}

	
	//#4 count "XX" in string
	public static int countXs(String str) {

		int cnt = 0;
		
		for (int i=0; i<str.length()-1; i++) {
			System.out.println(i+str.substring(i,i+2));//+ str.substring((i+1),1));		
			if (str.substring(i,i+2).contentEquals("xx")) {
				cnt = cnt + 1;
			}
			System.out.println(cnt);
		}
		return cnt;
	}
}

