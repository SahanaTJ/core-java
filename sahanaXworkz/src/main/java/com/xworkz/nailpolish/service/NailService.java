package com.xworkz.nailpolish.service;

import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import com.xworkz.nailpolish.dto.NailDTO;

public interface NailService {

	Set<ConstraintViolation<NailDTO>> validateAndSave(NailDTO dto);

	default NailDTO findById(int id) {
		return null;
	}

	 List<NailDTO> findByBrandName(String brandName);
	
}
