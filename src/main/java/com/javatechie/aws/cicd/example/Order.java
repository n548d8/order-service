package com.javatechie.aws.cicd.example;


//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//test
public class Order {

    public Order() {
		super();
	}
	public Order(int id, String name, int quantity, long price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	private int id;
    private String name;
    private int quantity;
    private long price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
}
