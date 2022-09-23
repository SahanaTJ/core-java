class PaintTester {
    
	public static void main(String a[]){
		
	   //Initializaton through setter method
     Paint.setPaintId(112);
	 Paint.setBrandName("Nerolac");
	 Paint.setColor("Blue");
	 
	   //get the data through getter method
	 System.out.println(Paint.getPaintId());
	 System.out.println(Paint.getBrandName());
	 System.out.println(Paint.getColor());
	}
}
	