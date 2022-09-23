class TeaStall {
     
	 static int teaStallId;
	 static String name;
	 static String address;
	 static long contactNo;
	 
	  // Setter and getter
	  static void setTeaStallId(int Id){
	 //access modifier ,return,setmethod(type,variablename);
	     teaStallId=Id;
	 }
       
	   static int getTeaStallId(){
		   return teaStallId;
	   }
	   static void setContactNo(long cNo){
		  contactNo=cNo;
	   }
	   static long getContactNo(){
		   return contactNo;
		 }
		static void setName(String nm){
			name= nm;
		}
		static String getName(){
		   return name;
		}
        static void setAddress(String add){
             address=add;
		}
        static String getAddress(){
			return address;
		}
		}		
	   
		   
	   