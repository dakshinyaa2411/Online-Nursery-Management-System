package com.paymentApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentApplication.entity.Payment;

public interface PaymentDao extends JpaRepository<Payment,Integer>{

}
