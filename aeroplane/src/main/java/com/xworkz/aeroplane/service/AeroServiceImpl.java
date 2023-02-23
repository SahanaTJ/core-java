package com.xworkz.aeroplane.service;

import java.util.Collections;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xworkz.aeroplane.dto.AeroDTO;
import com.xworkz.aeroplane.entity.AeroEntity;
import com.xworkz.aeroplane.repository.AeroRepository;

@Service
public class AeroServiceImpl implements AeroService {

	@Autowired
	private AeroRepository aeroRepository;

	public AeroServiceImpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<AeroDTO>> validateAndSave(AeroDTO dto) {
		System.out.println("");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<AeroDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violation is dto " + dto);
			return violations;

		} else {
			System.out.println("violation is not there in dto, can save");

			AeroEntity entity = new AeroEntity();
			entity.setCompanyName(dto.getCompanyName());
			entity.setName(dto.getName());
			entity.setType(dto.getType());
			entity.setCost(dto.getCost());
			entity.setCountry(dto.getCountry());
			boolean saved = this.aeroRepository.save(entity);
			System.out.println("Entity Data is saved " + saved);

			return Collections.emptySet();
		}
	}

	@Override
	public AeroDTO findById(int id) {
		if (id > 0) {
			System.out.println("findById in serviceImpl");
			AeroEntity entity = this.aeroRepository.findById(id);
			if (entity != null) {

				AeroDTO dto = new AeroDTO();
				dto.setCompanyName(entity.getCompanyName());
				dto.setName(entity.getName());
				dto.setCost(entity.getCost());
				dto.setType(entity.getType());
				dto.setCountry(entity.getCountry());
				return dto;
			}
		}
		return AeroService.super.findById(id);
	}
}
