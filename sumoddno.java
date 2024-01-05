package ifelse;

import java.util.Scanner;

public class sumoddno {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;

		System.out.print("Enter The 1st Number : ");
		num1 = input.nextInt();
		if (num1 % 2 == 1) {
			System.out.print("Enter The 2st Number : ");
			num2 = input.nextInt();
		}
		else {
			System.out.print("not accepted");
		}
		if (num2 % 2 == 1) {
			System.out.print("addition of given Number is : " + Math.addExact(num1, num2));
		} else {
			System.out.print("not accepted");
		}
	}
}
