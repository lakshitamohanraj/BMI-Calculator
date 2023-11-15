package com.bmi.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.bmi.demo.domain.BMIcalculate;

@Controller
public class BMIController {
	
    @GetMapping("/index") 
	public String viewForm(Model model) {
		model.addAttribute("BMIcalculate",new BMIcalculate());
		return "index";
	}
    
    @PostMapping("/bmi-calculate")
    public String calculate(@ModelAttribute BMIcalculate bmiCalculate,BindingResult result,Model model) {
    	model.addAttribute("BMIcalculate",bmiCalculate);
    	return "calculate";
    }
}
