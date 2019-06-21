package com.ikea.ipay.paymentTransaction.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="card")
public class Card implements Serializable  {
	
	@Id
	private int cardno;
	private String balance;
	
	public int getCardno() {
		return cardno;
	}
	public void setCardno(int cardno) {
		this.cardno = cardno;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Card [cardno=" + cardno + ", balance=" + balance + "]";
	}
	
}
