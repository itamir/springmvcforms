package br.com.imd.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.imd.domain.Usuario;

@Service
public class UsuarioRepository {

	public List<Usuario> usuarios;
	
	public UsuarioRepository() {
		usuarios = new ArrayList<Usuario>();
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

}
