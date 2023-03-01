package com.xworkz.nailpolish.dto;

import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NailDTO {
	
	private int id;
	@NotNull(message="Name cannot be null")
	private String name;
	
	@NotNull(message ="brandName cannot be null")
	private String brandName;
	
	@NotNull(message ="Place should be selected")
	private String color;
	
	@NotNull(message="price cannot be null")
	private Integer price;
	
	@NotNull(message="place should be selected")
	private String quality;
}


