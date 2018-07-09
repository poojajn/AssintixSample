package com.exilant.day1;

public class PriorityCutomer {
	private int customerId;
	private String customerName;
	private String type;

	public PriorityCutomer() {
	}

	public PriorityCutomer(int customerId, String customerName, String type) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.type = type;
	}

	@Override
	public String toString() {
		return "PriorityCutomer [customerId=" + customerId + ", customerName=" + customerName + ", type=" + type + "]";
	}

	public int getCustomerId() {
		return customerId;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
