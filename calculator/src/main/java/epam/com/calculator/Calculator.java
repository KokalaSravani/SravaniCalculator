package epam.com.calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		operations mp = new operations();
		System.out.println("Enter any two numbers");
		double num1 = sc.nextInt();
		double num2 = sc.nextInt();
		System.out.println("Select the operations -->  +,-,*,/");
		System.out.println("Enter 1 to Add" + "\n" +"Enter 2 to Substrat" + "\n" + "Enter 3 to Multiply" + "\n" + "Enter 4 to Divide");
		int option = sc.nextInt();
		switch(option){
		case 1:
			System.out.println("Solution : " + mp.add(num1, num2));
			break;
		case 2:
			System.out.println("Solution : " + mp.substract(num1, num2));
			break;
		case 3:
			System.out.println("Solution : " + mp.multiply(num1, num2));
			break;
		case 4:
			System.out.println("Solution : " + mp.divide(num1, num2));
			break;
		default:
			System.out.println("Invalid option");
			
		}
	}


}
