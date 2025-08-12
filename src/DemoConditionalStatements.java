import java.util.Scanner;

public class DemoConditionalStatements {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		if(x%2==0) {
			System.out.println("The given number is Even!");
		}
		else if(x%2!=0) {
			System.out.println("The given number is Odd!");
		}
		else {
			System.out.println("PLease! Enter the integer number!!");
		}

	}

}
