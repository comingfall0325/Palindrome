package day6;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		//check if a number is palindrome
		
		System.out.println("Enter a integer to see if it's palindrome");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int tempNum = num;
		
		int revNum = 0;
		int lastDigit;
		while (tempNum > 0) {
			lastDigit = tempNum % 10;
			revNum = revNum * 10 + lastDigit;
			tempNum = tempNum / 10;
		}
		
		if (num == revNum)
			System.out.println("This integer is a panlindrome");
		else
			System.out.println("This integer is not a panlindrome");
		
	}

}
