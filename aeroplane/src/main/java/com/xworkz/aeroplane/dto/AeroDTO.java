package com.xworkz.aeroplane.dto;

import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AeroDTO {

	@Id
	private int id;
	@NotNull(message ="companyName cannot be null")
	@NotBlank
	private String companyName;

	@NotNull(message="Name cannot be null")
	@NotEmpty
	private String name;
	
	@Min(value = 1)
	private Double cost;
	
	@NotNull(message ="Place should be selected")
	@NotEmpty
	private String type;
	
	@NotNull(message="Place should be selected")
	@NotEmpty
	private String country;
}
