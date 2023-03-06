package com.paymentApplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "payments")
public class Payment {
	public Payment() {
		super();
	}
	@Id
	@Column(name = "paymentId")
	private Integer paymentId;
	@Column(name = "paymentName")
	private String paymentName;
	
	public Payment(Integer paymentId, String paymentName) {
		super();
		this.paymentId = paymentId;
		this.paymentName = paymentName;
	}
	public Integer getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentName() {
		return paymentName;
	}
	public void setPaymentName(String paymentName) {
		this.paymentName = paymentName;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentName=" + paymentName + "]";
	}

}
