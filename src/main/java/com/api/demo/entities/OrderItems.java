package com.api.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orderitems", schema = "appStore")
public class OrderItems implements Serializable {

	/**
	 * This is OrderItems entity, where product are listed to order from it.
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name = "quantity")
	private int itemQuantity;
	@Column(name = "price")
	private Double price;

	public OrderItems() {
		// TODO Auto-generated constructor stub
	}

	public OrderItems(String name, String description, int itemQuantity, Double price) {
		super();
		this.name = name;
		this.description = description;
		this.itemQuantity = itemQuantity;
		this.price = price;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the itemQuantity
	 */
	public int getItemQuantity() {
		return itemQuantity;
	}

	/**
	 * @param itemQuantity the itemQuantity to set
	 */
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "OrderItems [id=" + id + ", name=" + name + ", description=" + description + ", itemQuantity="
				+ itemQuantity + ", price=" + price + "]";
	}

}
