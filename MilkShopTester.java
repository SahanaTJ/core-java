package com.xworkz.chatshop;

public class MilkShopTester {
   

	public static void main(String[] args) {
		String products[]=new String[3];
	       products[0]="Lays";
	       products[1]="Pedha";
	       products[2]="Curd";
	       
	       String billing[]=new String[2];
	       billing[0]="UPI";
	       billing[1]="Credit";
	       
	       int ordereditemlist[]=new int[2];
	       ordereditemlist[0]=2;
	       ordereditemlist[1]=3;
	       
	       
	       MilkShop i=new MilkShop("Nandini","Nagarbhavi",products,billing,ordereditemlist);
	       i.display();
	}
}
