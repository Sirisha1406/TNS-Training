package com.tns.polymorphism;

import java.util.Scanner;

public class TicketBookingMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Stage Event: ");
		 String stageEvent = sc.nextLine();
		 
		 System.out.println("Enter Customer Name: ");
		 String customer = sc.nextLine();
		 
		 System.out.println("Enter the No.of Seats");
		 int noOfSeats = sc.nextInt();
		 
		 TicketBooking ob=new TicketBooking(stageEvent,customer,noOfSeats);
		 System.out.println("\nChoose payment method:");
		 System.out.println("1.Cash Payment\n2.Wallet\n3.Credit Card");
		 int choice=sc.nextInt();
		 sc.nextLine();
		 
		 switch(choice) {
		 case 1:
			 System.out.println("Enter Amount: ");
			 double cashAmount=sc.nextDouble();
			 ob.makePayments(cashAmount);
			 break;
			 
		 case 2:
			 System.out.println("Enter the Wallet Number: ");
			 String Wallet=sc.nextLine();
			 System.out.println("Enter Amount: ");
			 double walletAmount=sc.nextDouble();
			 ob.makePayments(Wallet,walletAmount);
			 break;
			 
		 case 3:
			 System.out.println("Enter the Credit Card number: ");
			 String cardnumber=sc.nextLine();
			 System.out.println("Enter CCV: ");
			 String ccv=sc.nextLine();
			 System.out.println("Enter Card Holder name: ");
			 String name=sc.nextLine();
			 System.out.println("Enter Amount: ");
			 double cardamount=sc.nextDouble();
			 ob.makePayments(cardnumber,ccv,name,cardamount);
			 break;
			 
		default:
			System.out.println("Invalid Payment Option!! Please choose the correct payment Option.");
		 }
	sc.close();
	}

}
