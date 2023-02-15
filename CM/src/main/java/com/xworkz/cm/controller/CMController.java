package com.xworkz.cm.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.cm.dto.CMDTO;
import com.xworkz.cm.service.CMService;


@Controller
@RequestMapping("/cm")
public class CMController {

	@Autowired
	private CMService cmService;
	
	public CMController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@PostMapping()
	public String onOrder(CMDTO dto, Model model) {
		System.out.println("Running onCM"+dto);
		Set<ConstraintViolation<CMDTO>> constraintViolations = this.cmService.validateAndSave(dto);
		if(!constraintViolations.isEmpty()) {
			System.out.println("Validation failed, display error message");
		}else {
			System.out.println("Validation success, display error message");
		}
		return "CM.jsp";
	}
}


