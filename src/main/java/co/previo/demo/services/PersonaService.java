package co.previo.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.previo.demo.modelo.Persona;
import co.previo.demo.repositories.PersonaRepository;
import co.previo.demo.repositoryServices.PersonaRepositoryService;

@Service
public class PersonaService implements PersonaRepositoryService{

	@Autowired
	private PersonaRepository personaRepository; 
	
	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return personaRepository.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {
		return personaRepository.findById(id);
	}

	@Override
	public int save(Persona p) {
		int res=0;
		Persona persona = personaRepository.save(p);
		if(!persona.equals(null)){
			res=1;
		}
		return res;
	}

	@Override
	public void delte(int id) {
		personaRepository.deleteById(id);
	}

}
