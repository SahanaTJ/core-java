package com.xworkz.goa.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.goa.dto.CasinoDTO;
import com.xworkz.goa.service.CasinoRepository;

@Repository
public class CasinoRepositoryImpl implements CasinoRepository{

	@Autowired
	private CasinoRepository casinoRepository;
	private CasinoDTO dto;

	public  CasinoRepositoryImpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(CasinoDTO casinoDTO) {
		System.out.println("Running Validate and save in CasinoService" + dto);
		boolean saved = this.casinoRepository.save(dto);
		System.out.println("saved in repo" + saved);
		return false;
	}

}
