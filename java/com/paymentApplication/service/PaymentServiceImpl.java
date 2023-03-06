package com.paymentApplication.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentApplication.dao.PaymentDao;
import com.paymentApplication.entity.Payment;
import com.paymentApplication.exception.PaymentNotFoundException;



@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentDao paymentDao;


	@Override
	public List<Payment> getAllPayments() {
		return paymentDao.findAll();
	}

	@Override
	public Payment getPaymentById(Integer paymentId) throws PaymentNotFoundException {
		Payment p;
		if (paymentDao.findById(paymentId).isEmpty()) {
			throw new PaymentNotFoundException();
		} else {
			p = paymentDao.findById(paymentId).get();
		}
		return p;
	}

	@Override
	public Payment addPayment(Payment payment) {
		paymentDao.save(payment);
		return payment;
	}

	@Override
	public Payment updatePayment(Payment payment) {
		paymentDao.save(payment);
		return payment;
	}

	@Override
	public void deletePaymentById(Integer paymentId) {
		@SuppressWarnings("deprecation")
		Payment c = paymentDao.getById(paymentId);
		paymentDao.delete(c);
		
	}

}