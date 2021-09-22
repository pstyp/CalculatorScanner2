package com.qa.demo;

import java.util.Scanner;

import com.qa.exceptions.CantDivideByALargerNumberException;

public class Menu {

//	 Scanner input = new Scanner(System.in); 
	 Input input = new Input();

	public void menu() {
		
		boolean menuFlag = true;
		String menuOption = "";
	    int num1;
		int num2;
		
		
       
		
		System.out.println("Welcome to the Calculator app");

		while (menuFlag) {
			System.out.println("=".repeat(40));
			System.out.println("Please select which operation you would like to perform");
			System.out.println("=".repeat(40));
			System.out.println("\t1). Addition");
			System.out.println("\t2). Subtraction");
			System.out.println("\t3). Multiplication");
			System.out.println("\t4). Division");
			System.out.println("=".repeat(40));
			System.out.println("\t0). EXIT");

			menuOption = input.getString();
			
			switch (menuOption) {
				case "1":
					System.out.println("Please enter first number");
					num1 = input.getInt();
					System.out.println("Please enter second number");
					num2 = input.getInt();
					
					System.out.println("Your answer is: ");
					System.out.println(CalculatorScanner.add(num1, num2));
					break;
	
				case "2":
					System.out.println("Please enter first number");
					num1 = input.getInt();
					System.out.println("Please enter second number");
					num2 = input.getInt();
					System.out.println("Your answer is: ");
					System.out.println(CalculatorScanner.sub(num1, num2));
					break;
	
				case "3":
					System.out.println("Please enter first number");
					num1 = input.getInt();
					System.out.println("Please enter second number");
					num2 = input.getInt();
					System.out.println("Your answer is: ");
					System.out.println(CalculatorScanner.mul(num1, num2));
					break;
	
				case "4":
					System.out.println("Please enter first number");
					num1 = input.getInt();
					System.out.println("Please enter second number");
					num2 = input.getInt();
					System.out.println("Your answer is: ");
				try {
					System.out.println(CalculatorScanner.div(num1, num2));
				} catch (ArithmeticException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (CantDivideByALargerNumberException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					break;
					
				case "0":
					menuFlag = false;
					System.out.println("Bye!");
					break;
	
				default:
					System.out.println("Try again: ");
			}

			
		}
	}
	
}
