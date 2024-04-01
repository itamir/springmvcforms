package br.com.imd.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.imd.domain.Usuario;
import br.com.imd.repositories.UsuarioRepository;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepositorio;
	
	@RequestMapping("/usuarios")
	public List<Usuario> getUsuarios() {
		return usuarioRepositorio.getUsuarios();
	}

}
