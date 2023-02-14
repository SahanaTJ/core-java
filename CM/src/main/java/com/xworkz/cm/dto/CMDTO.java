package com.xworkz.cm.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name ="cm_table")
public class CMDTO implements Serializable{


	@Column(name = "id")
	@Id
	private int id;

	@Column(name = "cm_name")
	@NotNull
	@NotBlank(message ="Name should not be empty")
	@Size(min = 3, max = 20, message = "CM name should be more than 3 and less than 20 characters")
	private String name;

	@Column(name = "cm_state")
	@NotBlank(message = "State should not be blank, please select one")
	private String state;

	@Column(name = "cm_tenure")
	@NotNull
	@NotBlank(message = "Tenure should not be null, please select one")
	@Min(value = 1, message = "Tenure cannot be zero")
	private Integer tenure;

	@Column(name = "cm_party")
	@NotBlank(message = "Party should not be blank, please select one")
	private String party;

	@Column(name = "cm_portfolios")
	@NotBlank(message = "Party should not be blank, please select one")
	private String portfolios;

}