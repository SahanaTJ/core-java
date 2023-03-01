package com.xworkz.aeroplane.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@Table(name ="forest_table")
@ToString
@NamedQuery(name = "FindByName", query = "select punu from ForestEntity "
		+ "	punu where punu.name ='bandipur'")
public class ForestEntity {

	@Id
	@Column(name ="f_id")
	private int id;
	
	@Column(name ="f_name")
	private String name;
	
	@Column(name ="f_state")
	private String state;
	
	@Column(name ="f_area")
	private String area;
	
	@Column(name ="f_type")
	private String type;
}
