package com.encapsulation;

public class FixedDepositMain {

	
		public static void main(String[] args) {
			FixedDepositAccount fdamount=new FixedDepositAccount("manitha",190000,1000,2,200);
			System.out.println(fdamount.calculateMaturityAmount());
			fdamount.withdrawBeforeMaturity(28);
		}
	}