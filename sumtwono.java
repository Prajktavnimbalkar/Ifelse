package ifelse;

import java.util.Scanner;

public class sumtwono {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
 
		System.out.print("Enter The 1st Number : ");
		num1 = input.nextInt();
 
		System.out.print("Enter The 2nd Number : ");
		num2 = input.nextInt();
 
		System.out.print("addition of given Number is : " + Math.addExact(num1, num2));
	}
}


