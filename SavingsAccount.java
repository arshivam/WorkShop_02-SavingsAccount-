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
		return savingsBalance;
	}

	public static void main(String args[]) {
		SavingsAccount saver1 = new SavingsAccount();
		saver1.setSavingsBalance(2000);
		SavingsAccount.setAnnualIntrestRate(0.04);
		saver1.calculateMonthlyIntrest();
		System.out.println("For Saver1 : Saving bal is : "+saver1.getSavingsBalance()+" Aunnal Intrest Rate is : "+SavingsAccount.getAnnualIntrestRate()
		+" Monthly Interst : "+saver1.monthlyinterst);

		SavingsAccount saver2 = new SavingsAccount();
		saver2.setSavingsBalance(3000);
		SavingsAccount.setAnnualIntrestRate(0.05);
		saver2.calculateMonthlyIntrest();
		System.out.println("For Saver2 : Saving bal is : "+saver2.getSavingsBalance()+" Aunnal Intrest Rate is : "+SavingsAccount.getAnnualIntrestRate()
		+" Monthly Interst : "+saver2.monthlyinterst);
	}
}

