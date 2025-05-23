package com.encapsulation;

public class LoanApplicationMain {

	public static void main(String[] args) {
		LoanApplication loan=new LoanApplication("puji",19000,600,1,300);
		loan.displayLoanDatails();
		System.out.println();
	
		System.out.println();
		LoanApplication loanmain=new LoanApplication("puji",270000,600,1,300);
		loanmain.displayLoanDatails();
	}
}