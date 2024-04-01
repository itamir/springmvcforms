package br.com.imd.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.imd.domain.Papel;

@Service
public class PapelRepository {

	private List<Papel> papeis;
	
	public PapelRepository() {
		papeis = new ArrayList<Papel>();
	}
	
	public List<Papel> getPapeis(){	
		return papeis;
	}
	
	public Papel addPapel(Papel p) {
		papeis.add(p);
		return p;
	}
	
	
	
	
	
}
