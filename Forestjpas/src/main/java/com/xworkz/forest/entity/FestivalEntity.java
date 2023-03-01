package com.xworkz.forest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "festival_table")
@NoArgsConstructor
@NamedQuery(name = "findByIdAndName",query = "select en from FestivalEntity en where en.name ='Independence' and en.id =21")
@NamedQuery(name = "findByNameAndRegionAndMainGod", query = "select en from FestivalEntity en where en.name ='Christmas' and en.region ='Karnataka' and en.mainGod ='Jesus'")
@NamedQuery(name = "findByMainGod",query = "select en from FestivalEntity en where en.mainGod ='Shiva'")
@NamedQuery(name = "findTotalDaysByName",query = "select en.totalDays from FestivalEntity en where en.name='Holi Hunnime'")
@NamedQuery(name = "findRegionAndMainGodByNameAndId",query ="select en.region,en.mainGod from FestivalEntity en where en.name='Krishna Janmashtami' and en.id=11")
@NamedQuery(name = "findMainGodAndTotalDaysByName",query ="select en.mainGod, en.totalDays from FestivalEntity en where en.name='Ramzan'")
@NamedQuery(name = "findTotal",query="select count(en) from FestivalEntity en")
@NamedQuery(name = "findMaxTotalDays",query = "select max(totalDays) from FestivalEntity en")
public class FestivalEntity {

	
	@Id
	@Column(name = "f_id")
	private int id;
	@Column(name = "f_name")
	private String name;
	@Column(name = "f_region")
	private String region;
	@Column(name = "f_totalDays")
	private int totalDays;
	@Column(name = "f_sweet")
	private String sweet;
	@Column(name = "f_mainGod")
	private String mainGod;
	
	public FestivalEntity(String name, String region, int totalDays, String sweet, String mainGod) {
		super();
		this.name = name;
		this.region = region;
		this.totalDays = totalDays;
		this.sweet = sweet;
		this.mainGod = mainGod;
	}
	
}
