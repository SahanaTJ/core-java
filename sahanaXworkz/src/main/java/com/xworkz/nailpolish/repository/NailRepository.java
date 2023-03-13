package com.xworkz.nailpolish.repository;

import java.util.Collections;
import java.util.List;
import com.xworkz.nailpolish.entity.NailEntity;
public interface NailRepository {

	boolean save(NailEntity entity);
	boolean update(NailEntity entity);

	default NailEntity findById(int id) {
		return null;
  }
  
   default List<NailEntity> findByBrandName(){
  return Collections.emptyList();
   }
   
   default NailEntity onDelete(int id) {
		return null;
	}
   default List<NailEntity> list(){
		return Collections.emptyList();
	}
	default List<NailEntity> findTwoProperities(){
		return Collections.emptyList();
		
	}
	List<NailEntity> findByBrandName(String brandname);
 
   default List<NailEntity> findNameAndColor(String name, String color) {
	return Collections.emptyList();
}
	
 }