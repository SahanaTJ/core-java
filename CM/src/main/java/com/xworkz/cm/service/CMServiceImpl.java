package com.xworkz.cm.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ValidatorFactory;


import org.apache.el.util.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Validator;

import com.xworkz.cm.dto.CMDTO;
import com.xworkz.cm.repository.CMRepository;


@Service
public class CMServiceImpl implements CMService{

	public CMServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO cmdto) {
		System.out.println("Validate And Save in CM..."+cmdto);
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = (Validator) factory.getValidator();
		Set<ConstraintViolation<CMDTO>> constraintViolations = validator.validate(cmdto);

		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("ConstraintViolations exists, return constraintviolations");
			return constraintViolations;
		}else {
			System.out.println("ConstraintViolations not found , data is good");
			return Collections.emptySet();
		}

	}
}