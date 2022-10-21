package com.xworkz.chatshop;

public class IcecreamparlourTester {
   
	public static void main(String[] args) {
		String  IcecreamNames[]=new String[3];
		IcecreamNames[0]="Blackcurrent";
		IcecreamNames[1]="Chocolate";
		IcecreamNames[2]="Vanilla";
		
		String staffNames[]=new String[3];
		staffNames[0]="Chandra";
		staffNames[1]="Anu";
		staffNames[2]="Seema";
		
		long staffContactNo[]=new long[3];
		staffContactNo[0]=463893304L;
		staffContactNo[1]=343673949L;
		staffContactNo[2]=345378899L;
		
		String billingMethod[]=new String[3];
		billingMethod[0]="Credit";
		billingMethod[1]="Debit";
		billingMethod[2]="UPI";
		
		 Icecreamparlour i=new Icecreamparlour("3456789789","Vijaynagar","Ganesha",IcecreamNames,staffNames,staffContactNo,billingMethod);
		 i.display();
		
		}
}
