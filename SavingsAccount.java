package com.bridgelabz.workshop02;

import java.util.Scanner;


public class SavingsAccount {
	static double annualIntrestRate;
	private double savingsBalance;
	public  double monthlyinterst=0;


	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public static double getAnnualIntrestRate() {
		return annualIntrestRate;
	}

	public static void setAnnualIntrestRate(double annualIntrestRate) {
		SavingsAccount.annualIntrestRate = annualIntrestRate;
	}

	public double calculateMonthlyIntrest() {
		monthlyinterst = annualIntrestRate*savingsBalance/12;
		savingsBalance = savingsBalance + monthlyinterst;
		display(monthlyinterst);
		return savingsBalance;
	}

	public void display(double interest) {
		System.out.println("Monthly interest : " + interest);
		System.out.println("Saving Balance is : " + savingsBalance);
	}
	
	public static void modifyInterestRate(double interst) {
		annualIntrestRate = interst;
	}
}

