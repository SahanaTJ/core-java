package com.xworkz.cm.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.cm.dto.CMDTO;

public interface CMService {

	Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO dto);
	
}
