package mmm;

import java.util.Scanner;

public class POO3_Conditionalstatements {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter i = ");
			int i = sc.nextInt();
			System.out.println("enter j = ");
			int j = sc.nextInt();
			// 1.simple if
			if (i > j) {
				System.out.println("i is greater than j");
			}

			// if else
			if (i > j) {
				System.out.println("i is greater than j");
			} else {
				System.out.println("j is greater than i");
			}

			// 3.nested if
			System.out.println("enter age = ");
			int age = sc.nextInt();
			if (age > 18) {
				if (age < 60) {
					System.out.println("you are eligible");
				} else {
					System.out.println("age is greater than 18 but not less than 60");
				}
			} else {
				System.out.println("age is less than 18");
			}

			// 4.else if ladder
			System.out.println("enter marks  = ");
			int m = sc.nextInt();
			if (m < 35) {
				System.out.println("fail");
			} else if (m >= 35 && m <= 50) {
				System.out.println("pass class");
			} else if (m >= 51 && m <= 70) {
				System.out.println("C class");
			} else if (m >= 71 && m <= 80) {
				System.out.println("B class");
			} else if (m >= 81 && m <= 90) {
				System.out.println("A class");
			} else if (m >= 91 && m <= 100) {
				System.out.println("A+ class");
			} else {
				System.out.println("invalid input");
			}

			System.out.println("enter your choice : ");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			default:
				System.out.println("invalid");
			}
		}
	}