package com.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders_details")
public class Orders {
@Id
private int orderId;
private String customerName;
private long customerPhone;
private String booksPurchased;
private double Totalprice;
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public long getCustomerPhone() {
	return customerPhone;
}
public void setCustomerPhone(long customerPhone) {
	this.customerPhone = customerPhone;
}
public String getBooksPurchased() {
	return booksPurchased;
}
public void setBooksPurchased(String booksPurchased) {
	this.booksPurchased = booksPurchased;
}
public double getTotalprice() {
	return Totalprice;
}
public void setTotalprice(double tprice) {
	Totalprice = tprice;
}
}
