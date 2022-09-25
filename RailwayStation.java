class RailwayStation {
    
	static String Name;
    static String Address;
	static String SourceDestination;
	static String Price;
	
	static void setName(String nm){
	Name=nm;
	}
	static String getName(){
	return Name;
	}
	static void setAddress(String add){
	Address=add;
	}
	static String getAddress(){
	return Address;
	}
	static void setSourceDestination(String srcdec){
	SourceDestination=srcdec;
	}
	static String getSourceDestination(){
	return SourceDestination;
	}
	static void setPrice(String prc){
	Price=prc;
	}
	static String getPrice(){
	return Price;
	}
}