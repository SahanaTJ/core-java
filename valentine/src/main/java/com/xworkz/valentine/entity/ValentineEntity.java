package com.xworkz.valentine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "valentine_table")
public class ValentineEntity {

	@Column(name = "v_id")
    @Id 
    private int id;
	
	@Column(name= "v_name")
	private String name;
    
	@Column(name ="v_valentineName")
	private String valentineName;
	
	@Column(name = "v_place")
	private String places;
	
	@Column(name ="v_gift")
	private String gifts;
}