package com.mphasis.training.java151.Collectionss;



public class Product implements Comparable<Product>
{
	private int pid;
	private String pname;
	private double cost;
	private String brand;
	private int quantity;
	public int getPid() {
		return pid;
	}
	
	
	
	public Product(int pid, String pname, double cost, String brand, int quantity) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.cost = cost;
		this.brand = brand;
		this.quantity = quantity;
	}



	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	@Override
	public String toString() 
	{
		return "Product [pid=" + pid + ", pname=" + pname + ", cost=" + cost + ", brand=" + brand + ", quantity="
				+ quantity + "]";
	}


	// default sorting logic comparing pid and uses comparable
	//if u want sorting based on name u should use comparator


	@Override
	public int compareTo(Product p) 
	{
		if(p.pid > this.pid)
			return -1;
		else if(p.pid < this.pid)
			return 1;
		else
			return 0;
		
	}
	
	
}
