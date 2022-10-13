1.  Platform means the source code can run any windows and any processor.
    that means if the any    developer can write program or source code that will access or used by other developer with different location.
	and includes core topics like oops.
   
   
2. Primitive and non-primitives data types values
    Represented different values to be stored.
   *primitives types are 8
   1.byte-8byte
   2.int-4byte
   3.float-4byte
   4.long-8byte
   5.double-8byte
   6.char-2byte
   7.short-2byte
   8.boolean-1byte
   
   *Non-primitive data types
   String,System,Array Any uppercase latters
   
 
3. Class is a design or blueprint which contains states and behaviour,
   as variables behaviour are represented by methods,
   states represented by variables.
   The keyword must be followed by the class name inside the class, we declare methods and variables.
   
4. class Percentage {

     public static void main(String a[]){
	 
	 add(854,255)
	 
	 public static int add(int a,int b){
	 int c=a+b;
	 }
	 System.out.println(c);
	 double per=c/650*100;
	 System.out.println(per);
	 return;
	}
}

5.  class Array{
    
	int[] values={34,78,90,53,34,11,53,15,78,91,8,4,67,11};
	
	class RemoveDuplicateValues{
		public static void main(String a[]){
	int[] values={34,78,90,53,34,11,53,15,78,91,8,4,67,11};
	for (int i=0;i<array.length;i++){
	for(int j=0;j<array.length;j++){
    if(i!=j && array[i]==array[j]){
    System.out.println("Duplicate elements are"+array);
   }
 }
}
	
6. Main method
   
   public static void main(String args[]){
   
   public is access modifier or specifer
   static is  you can make a method static by using the keyword static. 
   void  every method has the return type. 
   main is a method it is a default signature which is predefined in the JVM.

   JVM Stands for java Virtual machine   





7. class ReverseNumber{  
	
	public static void main(String[] args) {  
    int num=32;
	int rev=num%10;
	for(int i=10;i>0;i--){
		System.out.println(i);  
	}  
  }
 }  	 
   
8. class Time{
    
	 Time(){
	System.out.println("Time is Constructor is called");
    }
    
    double hours;
	double seconds;
	
    public static  void togetFormat(){
	        System.out.println("Time is vary Precious");
	}
}
	
8.  class TimeTester {

    public static void main(String a[]){
	
	Time time =new Time();
	
	time.hours=01.22;
	time.seconds=45.00;
	
    System.out.println("The Correct  hours is "+time.hours);
	System.out.println("The Correct Seconds is "+ time.seconds);
	}
}
   
   
9. class ArmStrong {

    public static void main(String[]args){
	
	int n=153;
	int temp=n;
	int r,sum=0;
	
	while(n>0){
	
	r=n%10;
	n=n/10;
    sum=sum+r*r*r;
	}
	if(temp==sum)
	System.out.println("its an ArmStrong number");
	else
	System.out.println("Not an ArmStrong number");
	}
}
  
   
