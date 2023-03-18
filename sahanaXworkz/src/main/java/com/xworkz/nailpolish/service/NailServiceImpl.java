package com.xworkz.nailpolish.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xworkz.nailpolish.dto.NailDTO;
import com.xworkz.nailpolish.entity.NailEntity;
import com.xworkz.nailpolish.repository.NailRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class NailServiceImpl implements NailService {

	@Autowired
	private NailRepository nailRepository;

	public NailServiceImpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<NailDTO>> validateAndSave(NailDTO dto) {
		System.out.println("running validate and save in service Impl " + dto);
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<NailDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violation(s) in dto " + dto);
			return violations;
		} else {
			System.out.println("violation is not there in dto, can save");
			NailEntity entity = new NailEntity();
			BeanUtils.copyProperties(dto, entity); // copying dto data to entity
			boolean saved = this.nailRepository.save(entity);
			System.out.println("Entity Data is saved " + saved);

			return Collections.emptySet(); // there is no violations, an emptyset is there
		}
	}

	@Override
	public NailDTO findById(int id) {
		if (id > 0) {
			System.out.println("findById in serviceImpl");
			NailEntity entity = this.nailRepository.findById(id);
			if (entity != null) {
				NailDTO dto = new NailDTO();
				BeanUtils.copyProperties(entity, dto);
				return dto;
			}
		}
		return NailService.super.findById(id);
	}

	@Override
	public List<NailDTO> findByBrandName(String brandName) {
		System.out.println("running findByBrandName in service " + brandName);

		if (brandName != null && !brandName.isEmpty()) {
			System.out.println("Brand Name is Valid..... calling repo");
			List<NailEntity> entities = this.nailRepository.findByBrandName(brandName);
			List<NailDTO> listofDto = new ArrayList<NailDTO>();
			for (NailEntity entity : entities) {
				NailDTO dto = new NailDTO();
				BeanUtils.copyProperties(entity, dto); // utilities
				listofDto.add(dto);
			}
			System.out.println("Size of dtos " + listofDto.size());
			System.out.println("Size of entities " + entities.size());
			return listofDto;

		} else {
			System.err.println("Brandname is invalid");
		}
		return Collections.emptyList();
	}

	@Override
	public Set<ConstraintViolation<NailDTO>> validateAndUpdate(NailDTO dto) {
		System.out.println("running validate update serviceImpl");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<NailDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violation is dto " + dto);
			return violations;
		} else {
			System.out.println("violation is not there in dto, can save");

			NailEntity entity = new NailEntity();
			BeanUtils.copyProperties(dto, entity);
			boolean saved = this.nailRepository.update(entity);
			System.out.println("Entity Data is saved " + saved);
			return Collections.emptySet();
		}
	}

	@Override
	public NailDTO onDelete(int id) {

		NailEntity entity = nailRepository.onDelete(id);
		if (entity != null) {

			NailDTO dto = new NailDTO();
			BeanUtils.copyProperties(entity, dto);
			return dto;

		} else {
			return NailService.super.onDelete(id);
		}
	}
	
	@Override
	public List<NailDTO> list() {
		System.out.println("list in service");
		List<NailEntity> list = this.nailRepository.list();
		List<NailDTO> dtos = new ArrayList();
		if (list != null && !list.isEmpty()) {
			for (NailEntity entity : list) {
				NailDTO dto = new NailDTO();
				BeanUtils.copyProperties(entity, dto);
				dtos.add(dto);
			}
			System.out.println("size of dtos :" + dtos.size());
			System.out.println("Size of entities : " + list.size());
			return dtos;
		} else {
			System.out.println("No data found in database");
			return Collections.emptyList();
		}
	}	

	@Override
	public List<NailDTO> findTwoProperities(String name , String color){
		System.out.println("list in service");
		List<NailEntity> list = this.nailRepository.findNameAndColor(name, color);
		List<NailDTO> dtos = new ArrayList();
		if (list != null && !list.isEmpty()) {
			for (NailEntity entity : list) {
				NailDTO dto = new NailDTO();
				BeanUtils.copyProperties(entity, dto);
				dtos.add(dto);
			}
			System.out.println("size of dtos :" + dtos.size());
			System.out.println("Size of entities : " + list.size());
			return dtos;
		} else {
			System.out.println("No data found in database");
			return Collections.emptyList();
		}
	}
}