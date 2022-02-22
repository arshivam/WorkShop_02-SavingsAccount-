package com.bridgelabz.workshop02;

public class SavingsAccountMain {
	public static void main(String args[]) {
		SavingsAccount saver1 = new SavingsAccount();
		System.out.println("For Saver 1 : ");
		saver1.setSavingsBalance(2000);
		System.out.println("Annual Intrest : 4 %");
		SavingsAccount.setAnnualIntrestRate(0.04);
		saver1.calculateMonthlyIntrest();
		System.out.println("Annual Intrest : 5 %");
		SavingsAccount.modifyInterestRate(0.05);
		saver1.calculateMonthlyIntrest();
		System.out.println(" ");


		SavingsAccount saver2 = new SavingsAccount();
		System.out.println("For Saver 2 : ");
		saver2.setSavingsBalance(3000);
		System.out.println("Annual Intrest : 4 %");
		SavingsAccount.setAnnualIntrestRate(0.04);
		saver2.calculateMonthlyIntrest();
		System.out.println("Annual Intrest : 5 %");
		SavingsAccount.modifyInterestRate(0.05);
		saver1.calculateMonthlyIntrest();
	}
}
