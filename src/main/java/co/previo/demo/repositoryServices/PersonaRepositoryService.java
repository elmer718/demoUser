package co.previo.demo.repositoryServices;

import java.util.List;
import java.util.Optional;

import co.previo.demo.modelo.Persona;

public interface PersonaRepositoryService {

	public List<Persona>listar();
	public Optional<Persona>listarId(int id);
	public int save(Persona p);
	public void delte(int id);
}
