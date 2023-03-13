package com.xworkz.nailpolish.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import com.xworkz.nailpolish.dto.NailDTO;

public interface NailService {

	Set<ConstraintViolation<NailDTO>> validateAndSave(NailDTO dto);

	default NailDTO findById(int id) {
		return null;
	}

	 default List<NailDTO> findByBrandName(String brandName){
		 return Collections.emptyList();
	 }
	
	 Set<ConstraintViolation<NailDTO>> validateAndUpdate(NailDTO dto);

     default NailDTO onDelete(int id) {
	   return null;
   
     }

 	default List<NailDTO> list(){
 		return Collections.emptyList();
 	}
     
 	default List<NailDTO> findTwoProperities(String name,String color){
		return Collections.emptyList();
 		
 	}
}
