package com.ikea.ipay.paymentTransaction.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ikea.ipay.paymentTransaction.entity.Card;
import com.ikea.ipay.paymentTransaction.service.PaymentTransactionService;

@RestController
@RequestMapping("PaymentTransaction")
public class PaymentsTransactionRESTAPI {
	
	@Autowired PaymentTransactionService paymentTransactionservice;
	
	@GetMapping(path= "/CheckBalance/{cardno}", produces = "application/json")
	public ResponseEntity<Card> CheckBalance(@PathVariable(value="cardno") String cardno) {
		Card card = paymentTransactionservice.getCardBalance(Integer.parseInt(cardno));
		return new ResponseEntity<Card>(card, HttpStatus.OK);
	}

}
