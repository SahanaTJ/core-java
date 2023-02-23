package com.xworkz.aeroplane.controller;

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

import com.xworkz.aeroplane.dto.AeroDTO;
import com.xworkz.aeroplane.service.AeroService;

@Controller
@RequestMapping
public class AeroplaneController {

	@Autowired
	private AeroService aeroService;

	private List<String> type = Arrays.asList("Cargo plane", "Military plane", "PISTON AIRCRAFT", "LIGHT JETS",
			"HEAVY JETS");
	private List<String> country = Arrays.asList("India", "Austria", "Azerbaijan", "Monaco", "Belgium", "Denmark",
			"Serbia", "Ireland", "Italy", "Israel");

	public AeroplaneController() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@GetMapping("/aeroplane")
	public String onAero(Model model) {
		System.out.println("running onAeroplane Get Method");

		model.addAttribute("type", type);
		model.addAttribute("country", country);

		return "Aeroplane";
	}

	@PostMapping("/aeroplane")
	public String onValentine(Model model, AeroDTO dto) {
		System.out.println("running onAeroplane Post method" + dto);
		Set<ConstraintViolation<AeroDTO>> violations = this.aeroService.validateAndSave(dto);

		if (violations.isEmpty()) {
			System.out.println("no violation is controller go to success page");
			return "AeroplaneSuccess";
		}

		model.addAttribute("type", type);
		model.addAttribute("country", country);
		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);
		System.out.println("voilation in controller");
		return "Aeroplane";

	}

	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running on search for id" + id);

		AeroDTO dto = this.aeroService.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Data not found");
		}
		return "AeroplaneSearch";
	}

}
