package com.xworkz.goa.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.CasinoDTO;
import com.xworkz.goa.service.CasinoService;

@Component
@RequestMapping("/casino")
public class CasinoController {

	@Autowired
	private CasinoService casinoService;
	private CasinoDTO casinoDTO;
	
	public CasinoController() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onCasino(CasinoDTO dto, Model model) {
		System.out.println("Running Casino");
		model.addAttribute("name", dto.getName());
		model.addAttribute("cruise", dto.getCruise());
		model.addAttribute("entryFee", dto.getEntryFee());
		model.addAttribute("freeFood", dto.isFreeFood());
		boolean saved =this.casinoService.validateAndSave(casinoDTO);
		System.out.println("saved" + saved);
		return "CasinoSuccess.jsp";
	}
}
