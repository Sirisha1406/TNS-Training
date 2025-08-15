package com.tns.polymorphism;

public class TicketBooking {
	private String stageEvent;
	private String customer;
	private int noOfSeats;
	
	//default constructors
	public TicketBooking() {
		this.stageEvent="";
		this.customer="";
		this.noOfSeats=0;
	}
    //parameterized constructor
	public TicketBooking(String stageEvent, String customer, int noOfSeats) {
		super();
		this.stageEvent = stageEvent;
		this.customer = customer;
		this.noOfSeats = noOfSeats;
	}
	//getter & setters
	public void setstageEvent(String stageEvent) {
		this.stageEvent=stageEvent;
	}
	
	public String getstageEvent() {
		return stageEvent;
	}
	
	public void setcustomer(String customer) {
		this.customer=customer;
	}
	
	public String getcustomer() {
		return customer;
	}
	
	public void setnoOfSeats(int noOfSeats) {
		this.noOfSeats=noOfSeats;
	}
	
	public int getnoOfSeats() {
		return noOfSeats;
	}
	
	//parameterized constructor with return type
	//payment method
	public void makePayments(Double amount) {
		System.out.println("Cash Payment in Rs. "+amount+ "received.");
		printReceipt(amount,"Cash");
	}
	
	public void makePayments(String walletNumber,Double amount) {
		System.out.println("Wallet Payment of Rs. "+amount+"received from wallet: "+walletNumber);
		printReceipt(amount,"Wallet");
	}
	
	public void makePayments(String creditCard,String ccv,String name,Double amount) {
		System.out.println("\nCredit card Payment of Rs. "+amount+  "received.");
		System.out.println("Card Holder: "+name+ 
				"\nCard number: "+creditCard+
				"\nCCV: "+ccv);
		printReceipt(amount,"Credit card");
	}
	
	private void printReceipt(Double amount,String paymentType) {
		System.out.println("\n-----Receipt Details-----");
		System.out.println("Stage Events: "+stageEvent);
		System.out.println("Customer name: "+customer);
		System.out.println("No.of Seats Received: "+noOfSeats);
		System.out.println("Payment Type: "+paymentType);
		System.out.println("Total Amount paid: "+amount);
		System.out.println("\n----Ticket Booking Successfull!!!----");
	}

}
