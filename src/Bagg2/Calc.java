package Bagg2;

import java.util.Scanner;

public class Calc {

	private static Scanner in;
	private static Scanner in2;
	private static Scanner in3;
	private static Scanner in4;
	private static Scanner in5;

	public static void main(String[] args) {
		int num = operatorSelect();
		operators(num);
	}

	private static int operatorSelect() {
		in2 = new Scanner(System.in);
		System.out.print("1:Add, 2:Sub, 3:Mult, 4:Div:");
		int num = in2.nextInt();
		return num;
	}
	
	private static void operators(int num) {
		switch (num) {
		case 1:
			addValue();
			break;
		case 2:
			addSub();
			break;
		case 3:
			addMult();
			break;
		case 4:
			addDiv();
			break;

		default:
			break;
		}
	}
	
	private static void addDiv() {
		in = new Scanner(System.in);
		System.out.println("Enter the First No :");
		double d1 = in.nextDouble();
		System.out.println("Enter the Second No :");
		double d2 = in.nextDouble();
		double result = d1 / d2;
		System.out.println(result);				
	}

	private static void addMult() {
		in3 = new Scanner(System.in);
		System.out.println("Enter the First No :");
		double d1 = in3.nextDouble();
		System.out.println("Enter the Second No :");
		double d2 = in3.nextDouble();
		double result = d1 * d2;
		System.out.println(result);		
	}

	private static void addValue() {
		in5 = new Scanner(System.in);
		System.out.println("Enter the First No :");
		double d1 = in5.nextDouble();
		System.out.println("Enter the Second No :");
		double d2 = in5.nextDouble();
		double result = d1 + d2;
		System.out.println(result);
	}

	private static void addSub() {
		in4 = new Scanner(System.in);
		System.out.println("Enter the First No :");
		double d1 = in4.nextDouble();
		System.out.println("Enter the Second No :");
		double d2 = in4.nextDouble();
		double result = d1 - d2;
		System.out.println(result);
	}

}
