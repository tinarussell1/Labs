package labs;

import java.util.Scanner;

public class March262019LoopingToDifferentShapesLT {

private static Scanner input;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		//1. Write a program which generates following output:
		//*****
		//*****
		//*****
		System.out.println("#1 is");
		for (int i=0; i<3; i++) {
			for (int j=0; j<4; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		System.out.println();		
		
		//2. Write a program which generates following output:
		//*
		//**
		//***
		//****
		System.out.println("#2 is");
		for (int i=1; i<5; i++) {
			Math.abs(i);
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();	
		
		//3. Write a program which generates following output:
		//*****
		//****
		//***
		//**
		//*
		System.out.println("#3 is");
		for (int i=0; i<5; i++) {
			for (int j=5-i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();	
		
		
		//4. Write a program which generates following output:
		//12345
		//12345
		//12345
		//12345
		//12345
		System.out.println("#4 is");
		for (int i=0; i<5; i++) {
			for (int j=1; j<6; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();	
		
	
		//5. Write a program which generates following output:
		//1111
		//2222
		//3333
		System.out.println("#5 is");
		for (int i=1; i<=3; i++) {
			for (int j=0; j<4; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();	
		
		
		//6. Write a program which generates following output:
		//1
		//22
		//333
		//4444
		System.out.println("#6 is");
		for (int i=1; i<=4; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();	
		
		//7. Write a program which generates following output:
		//*
		//*
		//*
		//*
		//*****

		System.out.println("#7 is");
		for (int i=1; i<6; i++) {
			for (int j=0; j<5 ; j++) {
				System.out.print("*");
				if ( i != 5) { 
					j = j+5;
				}
			}
			System.out.println();
		}
		System.out.println();	
		
		
		//8. Write a program which generates following output:
		//*****
		//  *
		//  *
		//  *
		//  *

		System.out.println("#8 is");
		for (int i=1; i<6; i++) {
			for (int j=0; j<5 ; j++) {
				if ( i==1 || j==2) { 
					System.out.print("*");
				} else {System.out.print(" "); }
			}
			System.out.println();
		}
		System.out.println();	
		

	

	}

}
