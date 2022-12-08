package com.xworkz.showroomapp.showroom;

public class TataShowroom extends Showroom {
  
	public Manager[] managers;
	Manager[] newManager;
	int index;
	
	public TataShowroom() {
		
	}
	
	public TataShowroom(int size) {
		managers = new Manager[size];
	}
	
	public boolean addManager(Manager manager) {
		boolean isAdded = false;
		if(manager != null) {
			System.out.println("Managers details are right go ahead");
			managers[index++] = manager;
			isAdded = true;
		}
		return isAdded;
	}
	
	public void getAllManagerDetails() {
		System.out.println("List of all the details");
		for(int i = 0; i < managers.length; i++) {
			System.out.println(managers[i].getName() + " "+ managers[i].getAge() + " " + managers[i].getGender() + " "+
		                                                      managers[i].getContactNo());
		}
	}
	
	public void getManagerByName(String name) {
		System.out.println("inside getManagerByName");
		for(int i = 0; i < managers.length; i++) {
		     if(managers[i].getName().equals(name)) {
		    	 System.out.println(managers[i].getName() + " "+ managers[i].getAge() + " " + managers[i].getGender() + " "+
		                                                      managers[i].getContactNo());
		     }
			
		}
	}
	 
	public boolean updateManagerNameByAge(int age, String newName) {
		boolean isUpdated = false;
		System.out.println("inside updateManagerNameByAge");
		System.out.println("No of parameters : 2 : 1) param age(int) 2) param name(String)");
		for(int i =0; i < managers.length; i++) {
			if(managers[i].getAge() == age) {
				managers[i].setName(newName);
				isUpdated = true;
			}
			
			}
		return isUpdated;	
		}
	
	public boolean deleteManagerByAge(int age) {
		boolean isDeleted = false;
		newManager = new Manager[managers.length-1];
		for(int i = 0, k = 0; i < managers.length; i++) {
			if(managers[i].getAge() != age) {
				newManager[k++] = managers[i];
				isDeleted = true;
		}
		
	}
		return isDeleted;
		
	}
	
	public void getNewManager() {
		System.out.println("List of all manager");
		for(int i = 0; i < newManager.length; i++) {
			System.out.println(newManager[i].getName() + " " + newManager[i].getAge() + " " + newManager[i].getContactNo()
					              + " " + newManager[i].getGender());
		}
	}
}  
