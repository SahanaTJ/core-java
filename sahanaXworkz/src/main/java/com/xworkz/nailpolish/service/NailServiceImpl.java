package com.xworkz.nailpolish.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xworkz.nailpolish.dto.NailDTO;
import com.xworkz.nailpolish.entity.NailEntity;
import com.xworkz.nailpolish.repository.NailRepository;

@Service
public class NailServiceImpl implements NailService {


	@Autowired
	private NailRepository nailRepository;
	
	public NailServiceImpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}
	
	@Override
	public Set<ConstraintViolation<NailDTO>> validateAndSave(NailDTO dto) {
		System.out.println("running");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<NailDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violation is dto " + dto);
			return violations;

		} else {
			System.out.println("violation is not there in dto, can save");

			NailEntity entity = new NailEntity();
			entity.setName(dto.getName());
			entity.setBrandname(dto.getBrandName());
			entity.setColor(dto.getColor());
			entity.setPrice(dto.getPrice());
			entity.setQuality(dto.getQuality());
			boolean saved = this.nailRepository.save(entity);
			System.out.println("Entity Data is saved " + saved);

			return Collections.emptySet();
		}
	}

	@Override
	public NailDTO findById(int id) {
		if (id > 0) {
			System.out.println("findById in serviceImpl");
			NailEntity entity = this.nailRepository.findById(id);
			if (entity != null) {

				NailDTO dto = new NailDTO();
				dto.setName(entity.getName());
				dto.setBrandName(entity.getBrandname());
				dto.setColor(entity.getColor());
				dto.setPrice(entity.getPrice());
				dto.setQuality(entity.getQuality());
				return dto;
			}
		}
		return NailService.super.findById(id);
	}

	@Override
	public List<NailDTO> findByBrandName(String brandName) {
		System.out.println("running findByBrandName in service " + brandName);
		
		if ( brandName!=null && ! brandName.isEmpty()) {
			System.out.println("Brand Name is Valid..... calling repo");
			List<NailEntity> entities = this.nailRepository.findByBrandName(brandName);
			
			List<NailDTO> listofDto = new ArrayList<NailDTO>();
			for(NailEntity entity : entities) {
				NailDTO dto = new NailDTO();
				dto.setId(entity.getId());
				dto.setName(entity.getName());
				dto.setBrandName(entity.getBrandname());
				dto.setColor(entity.getColor());
				dto.setPrice(entity.getPrice());
				dto.setQuality(entity.getQuality());
				listofDto.add(dto);
			}
			
			System.out.println("Size of dtos " + listofDto.size());
			System.out.println("Size of entities " + entities.size());
			return listofDto;
			
		}else {
			System.err.println("Brandname is invalid");
		}
		return Collections.emptyList();
	}
}

