package co.previo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.previo.demo.modelo.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>{
//public interface PersonaRepository extends CrudRepository<Persona, Integer>
	
}
