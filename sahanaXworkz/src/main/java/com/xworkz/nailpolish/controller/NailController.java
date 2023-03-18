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

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class NailController {

	@Autowired
	private NailService nailService; 

	private List<String> color = Arrays.asList("Red", "Pink", "Dark red", "Green", "Blue","Purple");
	private List<String> quality = Arrays.asList("High", "Medium", "Low");

	public NailController() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@GetMapping("/nailpolish") // used to handle gettype of request method
	public String onNail(Model model) {
		System.out.println("running onNailpolish Get Method");
		log.info("running onNailpolish Get Method - vinay");
		model.addAttribute("color", color);
		model.addAttribute("quality", quality);

		return "Nailpolish";
	}

	@PostMapping("/nailpolish")
	public String onNailpolish(Model model, NailDTO dto) { 
		System.out.println("running onNailpolish Post method" + dto);
		Set<ConstraintViolation<NailDTO>> violations = this.nailService.validateAndSave(dto);

		if (violations.isEmpty()) {
			System.out.println("no violations found, go to success page");
			return "NailpolishSuccess";
		}

		model.addAttribute("color", color); //Return the current set of model attribute
		model.addAttribute("quality", quality);
		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);
		System.out.println("voilation in controller");
		return "Nailpolish";
	}

	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) { //Model - sending the data to web page
		System.out.println("running on Search controller " + id);
		NailDTO dto = this.nailService.findById(id);
		if (dto != null) {
			System.out.println("Dto found");
			model.addAttribute("dto", dto);
			System.out.println(dto.getName());
		} else {
			model.addAttribute("message", "data not found");
		}
		return "NailpolishSearch";

	}

	@GetMapping("/searchByBrandName")
	public String onSearchByBrandName(@RequestParam String brandName, Model model) {
		System.out.println("Running on SearchByBrandName controller" + brandName);

		List<NailDTO> list = this.nailService.findByBrandName(brandName);
		model.addAttribute("list", list);
		model.addAttribute("message", "Data not Found....");
		return "BrandNameSearch";
	}

	@GetMapping("/update")
	public String onUpdate(@RequestParam int id, Model model) { //Model - sending the data to web page
		System.out.println("running onUpdate " + id);
		NailDTO dto = this.nailService.findById(id);
		model.addAttribute("dto", dto);
		model.addAttribute("color", color);
		model.addAttribute("quality", quality);
		return "UpdateNail";

	}

	@PostMapping("/update")
	public String onUpdate(NailDTO dto, Model model) {
		System.out.println("running onUpdate " + dto);

		Set<ConstraintViolation<NailDTO>> constraintViolations = 
				this.nailService.validateAndUpdate(dto); // validation
		if (constraintViolations.size() > 0) {
			model.addAttribute("errors", constraintViolations);

		} else {
			model.addAttribute("message", "Nail Update Success....");
		}
		return "UpdateNail";
	}

	@GetMapping("/delete")
	public String onDelete(@RequestParam int id,Model model) {
		System.out.println("On delete Running");
		System.out.println("deleting ........................" + id);
		NailDTO dto = nailService.onDelete(id);
		model.addAttribute("delete", dto);
		model.addAttribute("messsage", "Data deleted sucessfully");

		return "NailDelete";
	}
	
	@GetMapping("list")
	public String onList(Model model) {
		System.out.println("list in controller");
		List<NailDTO> list = this.nailService.list();
		if(list!=null && !list.isEmpty()) {
			model.addAttribute("list",list);
		}else {
			model.addAttribute("message","No data found in database");
		}
		return "NailList";
	}
	
	@GetMapping("findNameAndColor")
	public String onFindNameAndColor(@RequestParam String name ,@RequestParam String color ,Model model) {
		System.out.println("find by name and color");
		List<NailDTO> list = this.nailService.findTwoProperities(name, color);
		if(list!=null & !list.isEmpty()) {
			model.addAttribute("list",list);
		}else {
			model.addAttribute("message", "No data found in database");
		}
		return "FindNameAndColor";
	}
}

