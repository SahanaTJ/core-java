package com.xworkz.hibernateCoreSpring.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sweetdto_table")
public class CasinoDTO {

  @Column(name ="sl_No")
  @Id
  private int slNo;
  @Column(name ="s_name")
  private String name;
  @Column(name ="s_type")
  private String type;
  @Column(name ="s_color")
  private String color;
  @Column(name ="s_price")
  private int price;
	
  public CasinoDTO() {
	  System.out.println("Created CasinoDTO using no-arg const......");
  }
}

