package com.xworkz.forest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name ="forest_table")
@ToString
@NamedQuery(name = "findByName", query = "select sana from ForestEntity "
		+ "	sana where sana.name ='Bandipura'")
@NamedQuery(name ="findByState",query ="select sana from ForestEntity sana where sana.state ='Karnataka'")
@NamedQuery(name ="findByNameAndStateAndArea",query = "select sana from ForestEntity sana where sana.name ='Bandipura' and sana.state ='Karnataka' and sana.area = 'Chamarajanagara'")
@NamedQuery(name ="findAreaByName", query = "select sana.area from ForestEntity sana where sana.name ='Bandipura'")
@NamedQuery(name ="findByNameAndState",query = "select sana from ForestEntity sana where sana.name='Bandipura' and sana.state ='Karnataka' ")
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
