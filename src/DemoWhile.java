//Returning the greater number using while loop

import java.util.Scanner;

public class DemoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number 1: ");
		int num1=sc.nextInt();
		System.out.println("Enter the number 2: ");
		int num2=sc.nextInt();
		
		int greater=num1;
		while(num2>greater){
			greater=num2;
			System.out.println("The greater number from both numbers: "+greater);
			sc.close();
		}

	}

}
