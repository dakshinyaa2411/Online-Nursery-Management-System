package com.paymentApplication.service;

import java.util.List;

import com.paymentApplication.entity.Payment;
import com.paymentApplication.exception.PaymentNotFoundException;

public interface PaymentService {
	
		public List<Payment> getAllPayments();
		public Payment getPaymentById(Integer PaymentId) throws PaymentNotFoundException;
		public Payment addPayment(Payment payment);
		public Payment updatePayment(Payment payment);
		public void deletePaymentById(Integer PaymentId);
		

}

