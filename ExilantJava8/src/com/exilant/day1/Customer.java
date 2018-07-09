package com.exilant.day1;

public class Customer {
	private int customerId;
	private String customerName;
	private double customerPurchases;
	private String desigantion;

	public Customer() {

	}

	public int getCustomerId() {
		return customerId;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPurchases="
				+ customerPurchases + ", desigantion=" + desigantion + "]";
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Customer(int customerId, String customerName, double customerPurchases, String desigantion) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPurchases = customerPurchases;
		this.desigantion = desigantion;
	}

	public double getCustomerPurchases() {
		return customerPurchases;
	}

	public void setCustomerPurchases(double customerPurchases) {
		this.customerPurchases = customerPurchases;
	}

	public String getDesigantion() {
		return desigantion;
	}

	public void setDesigantion(String desigantion) {
		this.desigantion = desigantion;
	}

}
