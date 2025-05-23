package com.encapsulation;

public class LoanApplication {

	private String customerName;
	private double loanAmount;
	private double interestRate;
	private int loanTerm;
	private double outStandingBalance;
	public LoanApplication(String customerName,double loanAmount,double interestRate,int loanTerm,double outStandingBalance) {
		this.customerName=customerName;
		this.loanAmount=loanAmount;
		this.interestRate=interestRate;
		this.loanTerm=loanTerm;
		this.outStandingBalance=outStandingBalance;
		System.out.println("Loan Applicaton Submitted");
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public int getLoanTerm() {
		return loanTerm;
	}
	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}
	public double getOutStandingBalance() {
		return outStandingBalance;
	}
	public void setOutStandingBalance(double outStandingBalance) {
		this.outStandingBalance = outStandingBalance;
	}
	public void makePayment(double amount){
		amount=this.outStandingBalance;
		if(amount<=0) {
			System.out.println("Invalid payment");
		}
		else{
			if(amount>this.outStandingBalance) {
				System.out.println("Payment exceeds loan");
			}
			else {
				System.out.println("Loan Approved");
			}
		}
	}
	public double calculateEMI() {
		double monthrate=this.interestRate/(12*100);
		int months=this.loanTerm*12;
		if(monthrate==0) {
			 return this.loanAmount/months;
		}
		double emi=(this.loanAmount*monthrate*Math.pow(1+monthrate, months))/(Math.pow(1+monthrate, months)-1);
		return Math.round(emi*100.0)/100.0;
	}
	public void displayLoanDatails() {
		System.out.println("Total Loan = "+loanAmount+"\nInterest Rate = "+interestRate+"\nEMI = "+this.calculateEMI()+"\nRemaining Balance = "+outStandingBalance);
	
	}
}