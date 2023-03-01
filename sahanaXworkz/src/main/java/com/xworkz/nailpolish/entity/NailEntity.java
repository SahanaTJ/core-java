package com.xworkz.nailpolish.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(name ="nailpolish")
@Entity
@NamedQuery(name ="findByBrandName",query = "select ent from NailEntity ent where ent.brandname=:bname")
public class NailEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "n_id")
	private int id;

	@Column(name = "n_name")
	private String Name;

	@Column(name = "n_brand_name")
	private String brandname;

	@Column(name = "n_color")
	private String color;

	@Column(name = "n_price")
	private int price;

    @Column(name ="n_quality")
    private String quality;

}


