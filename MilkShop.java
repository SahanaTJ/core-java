package com.xworkz.chatshop;

public class MilkShop {
    
	public String name;
	public String address;
	public String products[];
	public String billing[];
	public int ordereditemlist[];
	
	
	
	public MilkShop(String name, String address, String[] products, String[] billing,
			int[] ordereditemlist) {
		super();
		this.name = name;
		this.address = address;
		this.products = products;
		
		this.billing = billing;
		this.ordereditemlist = ordereditemlist;
	}
	public void display() {
		System.out.println("Enter name " + name);
		System.out.println("==================");
		System.out.println("==================");
		System.out.println("Enter address " + address);
		System.out.println("==================");
		System.out.println("==================");
		for(int i=0;i<products.length;i++) {
			System.out.println(products[i]);
		}
		System.out.println("==================");
		System.out.println("==================");
		for(int i=0;i<billing.length;i++) {
			System.out.println(billing[i]);
		}
		System.out.println("==================");
		System.out.println("==================");
		for(int i=0;i<ordereditemlist.length;i++) {
			System.out.println(ordereditemlist[i]);
		}
		
		
	}
	
	
}
