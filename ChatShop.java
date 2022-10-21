package com.xworkz.chatshop;

public class ChatShop {
   
	public String gstNo;
	public String address;
	public String name;
	//String stad;
	public String chatNames[];
	public String staffNames[];
	public long staffContactNo[];
	public String billingMethod[];
	
	public ChatShop(String gstNo,String address,String name,String[] chatNames,String[] staffNames,long[] staffContactNo,String[] billingMethod)
	{
          this.gstNo=gstNo;
          this.address=address;
          this.name=name;
          this.chatNames=chatNames;
          this.staffNames=staffNames;
          this.staffContactNo=staffContactNo;
          this.billingMethod=billingMethod;
}
	public void display() {
		System.out.println("Gst number is " + gstNo);
		System.out.println("========================");
		System.out.println("========================");
		System.out.println("Address is " + address);
		System.out.println("========================");
		System.out.println("========================");
		System.out.println("Name is" + name);
		System.out.println("========================");
		System.out.println("========================");
		for(int i=0;i<chatNames.length;i++)
		{
			System.out.println(chatNames[i]);
		}
		System.out.println("========================");
		System.out.println("========================");
		//System.out.println("========================");
		//System.out.println("========================");
		for(int i=0;i<staffNames.length;i++)
		{
			System.out.println(staffNames[i]);
		}
		System.out.println("========================");
		System.out.println("========================");
		for(int i=0;i<staffContactNo.length;i++)
		{
			System.out.println(staffContactNo[i]);
		}
		System.out.println("========================");
		System.out.println("========================");
		for(int i=0;i<billingMethod.length;i++)
		{
			System.out.println(billingMethod[i]);
		}
		System.out.println("========================");
		System.out.println("========================");
		
		
	}
}
