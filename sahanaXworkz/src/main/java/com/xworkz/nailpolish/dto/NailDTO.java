package com.xworkz.nailpolish.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NailDTO {
	
	private int id;
	
	@NotNull(message ="brandName cannot be null")
	private String brandName;
	
	@NotNull(message="Name cannot be null")
	@Size(min = 3, max = 20, message = "name should be 3 to 20 characters")
	private String name;
	
	@NotNull(message ="Place should be selected")
	private String color;
	
	@NotNull(message="price cannot be null")
	@Min(value = 1, message = "Price can't be negative")
	private Integer price;   
	
	@NotNull(message="place should be selected")
	private String quality;
}


