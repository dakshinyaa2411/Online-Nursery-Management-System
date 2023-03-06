package com.paymentApplication.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paymentApplication.entity.Payment;
import com.paymentApplication.exception.PaymentNotFoundException;
//import com.paymentApplication.service.PaymentNotFoundException;
import com.paymentApplication.service.PaymentService;
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class PaymentController {
	@Autowired
	private PaymentService paymentService;
	

	@GetMapping("/payments")
	public List<Payment> getAllPayments() {
		return this.paymentService.getAllPayments();
	}

	@GetMapping("/payments/{paymentId}")
	public ResponseEntity<Payment> getPaymentById(@PathVariable("paymentId") Integer paymentId)
			throws PaymentNotFoundException {
		return new ResponseEntity<Payment>(paymentService.getPaymentById(paymentId), HttpStatus.OK);
	}

	@PostMapping("/payments")
	public Payment addPayment(@RequestBody Payment payment) {

		return this.paymentService.addPayment(payment);
	}

	@PutMapping("/payments")
	public Payment updatePayment(@RequestBody Payment payment) {
		return this.paymentService.updatePayment(payment);

	}

	@DeleteMapping("/payments/{paymentId}")
	public void deletePaymentyById(@PathVariable Integer paymentId) {
		this.paymentService.deletePaymentById(paymentId);
	}
	

}


