package Length;

import java.util.Scanner;

public class CalculateLength {
	public static void main(String[] args) {
		System.out.println("This is program calculate the length");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x1");
		double x1 = sc.nextDouble();
		System.out.println("Enter the value of x2");
		double x2 = sc.nextDouble();
		System.out.println("Enter the value of y1");
		double y1 = sc.nextDouble();
		System.out.println("Enter the value of y2");
		double y2 = sc.nextDouble();
		
		  double length1;
	       double length2 = 0.0;
	       
	       length1 = Math.sqrt((x2 - x1 ) + (y2 - y1) * (x2 - x1 ) + (y2 - y1));
	       System.out.println("The length is :" + length1);
	       System.out.println("The length is :" + length2);
	     System.out.println("length1 is equal to length2 = "+(length1 == length2)); 
	      System.out.println("length1 is not equal to length2 = "+(length1 != length2));
		
	}

}
