package com.ikea.ipay.paymentTransaction.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ikea.ipay.paymentTransaction.entity.Card;

@Transactional
@Repository
public class PaymentTransactionDAOImp implements PaymentTransactionDAO {
	
	@PersistenceContext
	private EntityManager entitymaneger;
	@Override
	public Card getCardBalance(int cardno) {
		
		return entitymaneger.find(Card.class, cardno);
	}

}
