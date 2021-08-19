package Swapping;

import java.util.Scanner;

public class SwapNumber {
	public static void main(String[] args) {
		//Decleration part
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		//user input part
		System.out.println("Enter the first value of a");
		a = sc.nextInt();
		System.out.println("Enter the second value of b");
		b = sc.nextInt();
		//execution part
		
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println(a);
		System.out.println(b);
	}
		
	}


