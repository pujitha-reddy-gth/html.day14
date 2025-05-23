package com.encapsulation;

public class CreditCardMain {

	
		public static void main(String[] args) {
			CreditCardAccount crtedi=new CreditCardAccount("Indhu",100000,2500,2);
			crtedi.swipeCard(55000);
			crtedi.makePayment(36000);
			crtedi.applyInterest();
		}
	}