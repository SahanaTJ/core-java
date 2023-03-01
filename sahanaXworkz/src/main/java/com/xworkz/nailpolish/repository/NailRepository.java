package com.xworkz.nailpolish.repository;

import java.util.Collections;
import java.util.List;
import com.xworkz.nailpolish.entity.NailEntity;
public interface NailRepository {

	boolean save(NailEntity entity);

	default NailEntity findById(int id) {
		return null;
}
  
   default List<NailEntity> findByBrandName(String brandname){
  return Collections.emptyList();
   }
 
 }