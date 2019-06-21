package com.ikea.ipay.paymentTransaction.dao;

import com.ikea.ipay.paymentTransaction.entity.Card;

public interface PaymentTransactionDAO  {
	
	public Card getCardBalance(int cardno);
}
