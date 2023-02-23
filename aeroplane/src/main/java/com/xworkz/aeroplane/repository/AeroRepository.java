package com.xworkz.aeroplane.repository;

import com.xworkz.aeroplane.entity.AeroEntity;

public interface AeroRepository {

	boolean save(AeroEntity entity);

	AeroEntity findById(int id);
}
