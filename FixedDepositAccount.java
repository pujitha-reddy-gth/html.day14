package com.encapsulation;

public class FixedDepositAccount {

	
		private String customerName;
		private double principalAmount;
		private double interestRate;
		private int duration;
		private double maturityAmount;
		public FixedDepositAccount(String customerName,double principalAmount,double interestRate,int duration,double maturityAmount) {
			this.customerName=customerName;
			this.principalAmount=principalAmount;
			this.interestRate=interestRate;
			this.duration=duration;
			this.maturityAmount=maturityAmount;
			System.out.println("Fixed Deposit Created Successfully");
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public double getPrincipalAmount() {
			return principalAmount;
		}
		public void setPrincipalAmount(double principalAmount) {
			this.principalAmount = principalAmount;
		}
		public double getInterestRate() {
			return interestRate;
		}
		public void setInterestRate(double interestRate) {
			this.interestRate = interestRate;
		}
		public int getDuration() {
			return duration;
		}
		public void setDuration(int duration) {
			this.duration = duration;
		}
		public double getMaturityAmount() {
			return maturityAmount;
		}
		public void setMaturityAmount(double maturityAmount) {
			this.maturityAmount = maturityAmount;
		}
		public double calculateMaturityAmount() {
			double rate=this.interestRate/(100);
			double compinterest=(this.principalAmount*Math.pow(1+(rate/12), 12*this.duration));
			this.maturityAmount=compinterest;
			return Math.round(maturityAmount*100.0)/100.0;
		}
		public void withdrawBeforeMaturity(int withdrawmonths) {
			if(withdrawmonths<12) {
				System.out.println("Cannot withdraw before one year");
			}
			else if(withdrawmonths<this.duration*12) {
				double penality=this.principalAmount*0.02;
				double withdrawalAmount=this.maturityAmount-penality;
				System.out.println("After Penality : "+Math.round(withdrawalAmount*100.0)/100.0);
			}
			else {
				System.out.println("Withdraw your amount for "+withdrawmonths+" months");
			}
		}
	}


