package br.com.imd.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.imd.domain.Papel;
import br.com.imd.repositories.PapelRepository;

@RestController
public class PapelController {
	
	private final PapelRepository papelRepositorio;
	
	public PapelController(PapelRepository papelRepositorio) {
		this.papelRepositorio = papelRepositorio;
	}

	@GetMapping("/papeis")
	public List<Papel> getPapeis() {
		return papelRepositorio.getPapeis();
	}
	
	@PostMapping("/papeis")
	public Papel addPapel(@RequestBody Papel papel) {
		return papelRepositorio.addPapel(papel);
	}
}
