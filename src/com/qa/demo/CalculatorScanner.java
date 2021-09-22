package com.qa.demo;

import java.util.Scanner;

import com.qa.exceptions.CantDivideByALargerNumberException;


public class CalculatorScanner {

	public static double result;

	

	public static double add(double firstNumber, double secondNumber) {

		result = firstNumber + secondNumber;

		return result;
	}

	public static double sub(double firstNumber, double secondNumber) {

		result = firstNumber - secondNumber;

		return result;
	}

	public static double mul(double firstNumber, double secondNumber) {

		result = firstNumber * secondNumber;
		return result;
	}

		public static double div(double x, double y) throws ArithmeticException, CantDivideByALargerNumberException {

			if (y == 0) {
				throw new ArithmeticException("Cannot div by 0");
			}else if (x < y){
				throw new CantDivideByALargerNumberException("Avoid dividing by a large number than " + x);
			}else {
				return x / y;
			}
		}

	}

