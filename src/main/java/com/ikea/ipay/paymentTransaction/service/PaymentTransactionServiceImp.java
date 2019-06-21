package com.ikea.ipay.paymentTransaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ikea.ipay.paymentTransaction.dao.PaymentTransactionDAO;
import com.ikea.ipay.paymentTransaction.entity.Card;

@Service
public class PaymentTransactionServiceImp implements PaymentTransactionService {
	
	@Autowired PaymentTransactionDAO paymentTransactionDao;
	@Override
	public Card getCardBalance(int cardno) {
		
		return paymentTransactionDao.getCardBalance(cardno);
	}

}
