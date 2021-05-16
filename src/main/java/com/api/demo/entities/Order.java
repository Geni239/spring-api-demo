package com.api.demo.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders", schema = "appStore")
public class Order implements Serializable {

	/**
	 * This is order entity:: End user place this order after cart in the items
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@Column(name = "username")
	private String uName; // user name
	@Column(name = "itemname")
	private String iName; // item name
	@Column(name = "placedon")
	private Date orderPlacedOn;
	@Column(name = "description")
	private String orderDescription;
	@Column(name = "total")
	private double orderTotal;

	public Order() {
		// TODO Auto-generated constructor stub
	}


	public Order(String uname, String iname, Date orderPlacedOn,
			String orderDescription, double orderTotal) {
		super();
		this.uName = uname;
		this.iName = iname;
		this.orderPlacedOn = orderPlacedOn;
		this.orderDescription = orderDescription;
		this.orderTotal = orderTotal;
	}



	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the uName
	 */
	public String getuName() {
		return uName;
	}

	/**
	 * @param uName the uName to set
	 */
	public void setuName(String uName) {
		this.uName = uName;
	}

	/**
	 * @return the iName
	 */
	public String getiName() {
		return iName;
	}

	/**
	 * @param iName the iName to set
	 */
	public void setiName(String iName) {
		this.iName = iName;
	}

	/**
	 * @return the orderPlacedOn
	 */
	public Date getOrderPlacedOn() {
		return orderPlacedOn;
	}

	/**
	 * @param orderPlacedOn the orderPlacedOn to set
	 */
	public void setOrderPlacedOn(Date orderPlacedOn) {
		this.orderPlacedOn = orderPlacedOn;
	}

	/**
	 * @return the orderDescription
	 */
	public String getOrderDescription() {
		return orderDescription;
	}

	/**
	 * @param orderDescription the orderDescription to set
	 */
	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}

	/**
	 * @return the orderTotal
	 */
	public double getOrderTotal() {
		return orderTotal;
	}

	/**
	 * @param orderTotal the orderTotal to set
	 */
	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}

	@Override
	public String toString() {
		return "Order{" +
				"id=" + id +
				", uName='" + uName + '\'' +
				", iName='" + iName + '\'' +
				", orderPlacedOn=" + orderPlacedOn +
				", orderDescription='" + orderDescription + '\'' +
				", orderTotal=" + orderTotal +
				'}';
	}
}
