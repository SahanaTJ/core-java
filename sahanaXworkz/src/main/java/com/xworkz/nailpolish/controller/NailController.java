package com.xworkz.nailpolish.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.xworkz.nailpolish.dto.NailDTO;
import com.xworkz.nailpolish.service.NailService;


@Controller
@RequestMapping

public class NailController {

	@Autowired
	private NailService nailService;

	private List<String> color = Arrays.asList("Red", "Pink", "Dark red", "Green","Blue");
	private List<String> quality = Arrays.asList("High","Midium","Low");

	public NailController() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@GetMapping("/nailpolish")
	public String onNail(Model model) {
		System.out.println("running onNailpolish Get Method");

		model.addAttribute("color", color);
		model.addAttribute("quality", quality);

		return "Nailpolish";
	}

	@PostMapping("/nailpolish")
	public String onNailpolish(Model model, NailDTO dto) {
		System.out.println("running onNailpolish Post method" + dto);
		Set<ConstraintViolation<NailDTO>> violations = this.nailService.validateAndSave(dto);

		if (violations.isEmpty()) {
			System.out.println("no violation is controller go to success page");
			return "NailpolishSuccess";
		}

		model.addAttribute("color", color);
		model.addAttribute("quality", quality);
		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);
		System.out.println("voilation in controller");
		return "Nailpolish";
	}
	
	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model ) {
		System.out.println("running on Search controller " + id);
		NailDTO dto = this.nailService.findById(id);
		if(dto!=null) {
			System.out.println("Dto found");
			model.addAttribute("dto", dto);
			System.out.println(dto.getName());
		} else {
			model.addAttribute("message","data not found");
		}
		return "NailpolishSearch";
		
	}

	@GetMapping("/searchByBrandName")
	public String onSearchByBrandName(@RequestParam String brandName, Model model) {
		System.out.println("Running on SearchByBrandName controller" + brandName);

		List<NailDTO>list = this.nailService.findByBrandName(brandName);
		model.addAttribute("list",list);
		
		return "BrandNameSearch";
	}

}


