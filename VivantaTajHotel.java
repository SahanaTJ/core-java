class VivantaTajHotel{
  public static void main(String a[]){
    String type = "5 star Hotel";
    String address = "yashwanthpur";
    String[] managerNames = {"Akshata","Laksmi","Ganesha","Sahana","Mahendra"};
    int noOfManagers = 5;
	
    String foodMenu[] = {"Chapathi","Puri","Masala Dosa","FrideRice","Goobi","Panipuri","Eggrice","vegbiriyani",
                      "Curdrice","Vegpalav","barger","Rotti","Masalamaggie","Bisibelebath","pulivagre"};
    System.out.println("Welcome to VivantaTajHotel");
    System.out.println("Destination: " + address);
    System.out.println("Name of List of Managers");
	
    for (int c=0;c<managerNames.length;c++){
		System.out.println(managerNames[c]);
    }
		System.out.println("List of FoodMenu");
    for(int s=0;s<foodMenu.length;s++){
		System.out.println(foodMenu[s]);
    }
  }
}
            //Task  EmpireHotel , Truffles