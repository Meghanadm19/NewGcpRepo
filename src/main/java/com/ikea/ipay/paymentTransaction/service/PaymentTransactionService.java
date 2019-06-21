package com.ikea.ipay.paymentTransaction.service;

import com.ikea.ipay.paymentTransaction.entity.Card;

public interface PaymentTransactionService {
	
	public Card getCardBalance(int cardno);

}
