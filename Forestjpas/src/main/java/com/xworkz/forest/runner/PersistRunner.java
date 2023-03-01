package com.xworkz.forest.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.forest.entity.FestivalEntity;

public class PersistRunner {

public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
//		FestivalEntity entity = new FestivalEntity("Christmas", "Karnataka",5,"Cake","shiva");
//		FestivalEntity entity1 = new FestivalEntity("NewYear", "America",1,"Donuts","Mary");
//		FestivalEntity entity2 = new FestivalEntity("Deepavali", "Bilagi",2,"Payasa","Laxmi");
//		FestivalEntity entity3 = new FestivalEntity("Dassera", "Gujarat",3,"Holagi","Durga");
//		FestivalEntity entity4 = new FestivalEntity("Holi Hunnime", "Bagalkot",4,"Genasu","Kamanna");
//		FestivalEntity entity5 = new FestivalEntity("Ramzan", "Chichkandi",7,"Surkurma","Alha");
//		FestivalEntity entity6 = new FestivalEntity("Bakrid", "Muchkandi",6,"Madali","Sayed Murtuj");
//		FestivalEntity entity7 = new FestivalEntity("Good Friday", "Katageri",8,"Kesari bath","Jesus Christ");
//		FestivalEntity entity8 = new FestivalEntity("Sankranti", "Asangi",9,"Shenga Holigi","Shankramma");
//		FestivalEntity entity9 = new FestivalEntity("Ganesh Chaturti", "Pattadkal",10,"Modak","Ganesh");
//		FestivalEntity entity10 = new FestivalEntity("Krishna Janmashtami", "Mudhol",11,"Jamoon","Krishna");
//		FestivalEntity entity11= new FestivalEntity("Rama Navami", "Lokapur",12,"Rasgulla","Rama");
//		FestivalEntity entity12 = new FestivalEntity("Childrens day", "Delhi",13,"Laddu","Netaji");
//		FestivalEntity entity13 = new FestivalEntity("Republic day", "Maharstra",14,"Chocolate","Dr. Ambedkar");
//		FestivalEntity entity14 = new FestivalEntity("Onam", "Kerala",15,"Laadu","Mahanandi");
//		FestivalEntity entity15 = new FestivalEntity("Maha Shivaratri", "Koimbatur",16,"Sabudani Keer","Shiva");
//		FestivalEntity entity16 = new FestivalEntity("Water day", "Guledgudd",17,"Jangeer","Annakarmel");
//		FestivalEntity entity17 = new FestivalEntity("Rakshabandhan", "Ilkal",18,"Shira","Annayya");
//		FestivalEntity entity18 = new FestivalEntity("Navaratri", "Jagadal",19,"Sajjaka","Navadevi");
//		FestivalEntity entity19 = new FestivalEntity("Moram", "Vidyagiri",20,"Peda","Ale Devru");
//		FestivalEntity entity20 = new FestivalEntity("Independence", "Jamkhandi",21,"Barfi","Bharat mata");
//		FestivalEntity entity21 = new FestivalEntity("Kannada rajyotsva", "Kaladagi",22,"Mysore pack","Kannadambe");
//		FestivalEntity entity22 = new FestivalEntity("Gouri habba", "Siddapur",23,"KArchi kai","Gouri");
//		FestivalEntity entity23 = new FestivalEntity("Ghandhi jayanti", "Terdal",24,"Chakkoli","Ghandi");
//		FestivalEntity entity24 = new FestivalEntity("Ponagal", "Banatti",25,"Pongal","Vishnu");
		FestivalEntity entity25 = new FestivalEntity("Panjurli Habba", "Mangalore",28,"Ganji","Panjurli devru");

		transaction.begin();
//		manager.persist(entity);
//		manager.persist(entity1);
//		manager.persist(entity2);
//		manager.persist(entity3);
//		manager.persist(entity4);
//		manager.persist(entity5);
//		manager.persist(entity6);
//		manager.persist(entity7);
//		manager.persist(entity8);
//		manager.persist(entity9);
//		manager.persist(entity10);
//		manager.persist(entity11);
//		manager.persist(entity12);
//		manager.persist(entity13);
//		manager.persist(entity14);
//		manager.persist(entity15);
//		manager.persist(entity16);
//		manager.persist(entity17);
//		manager.persist(entity18);
//		manager.persist(entity19);
//		manager.persist(entity20);
//		manager.persist(entity21);
//		manager.persist(entity22);
//		manager.persist(entity23);
//		manager.persist(entity24);
		manager.persist(entity25);
		
		transaction.commit();
	}
}
