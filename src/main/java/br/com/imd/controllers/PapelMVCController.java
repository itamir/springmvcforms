package br.com.imd.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.imd.domain.Papel;
import br.com.imd.repositories.PapelRepository;

@Controller
public class PapelMVCController {

	@Autowired
	private PapelRepository papelRepository;
	
	@GetMapping("/novopapel")
	public String form(Model model) {
		model.addAttribute("papel", new Papel());
		return "form";
	}
	
	@PostMapping("/novopapel")
	  public String submit(@ModelAttribute Papel papel, 
			  Model model) {
		papelRepository.addPapel(papel);
	    model.addAttribute("papel", papel);
	    return "result";
	  }
}
