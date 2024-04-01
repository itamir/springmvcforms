package br.com.imd.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.imd.domain.Papel;
import br.com.imd.repositories.PapelRepository;

@RestController
public class PapelController {
	
	@Autowired
	private PapelRepository papelRepositorio;

	@RequestMapping("/papeis")
	public List<Papel> getPapeis() {
		return papelRepositorio.getPapeis();
	}
	
	@PostMapping("/papeis")
	public Papel addPapel(@RequestBody Papel papel) {
		return papelRepositorio.addPapel(papel);
	}
}
