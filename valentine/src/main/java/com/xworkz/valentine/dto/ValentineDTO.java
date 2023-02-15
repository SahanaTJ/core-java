package com.xworkz.valentine.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ValentineDTO {

	@Size(min=3,max=20, message = "Name cannot be less than 3 or greater than 10")
	private String name;

	@Size(min=3,max=20, message ="ValentineName can be less than 3 or greater than 10")
	private String valentineName;
	
	@NotBlank(message ="Place should be selected")
	private String places;
	
	@NotBlank(message ="Gift should be selected")
	private String gifts;
}
