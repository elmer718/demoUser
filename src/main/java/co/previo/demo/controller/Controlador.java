package co.previo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.previo.demo.modelo.Persona;
import co.previo.demo.repositoryServices.PersonaRepositoryService;

@Controller
@RequestMapping
public class Controlador {

	@Autowired
	private PersonaRepositoryService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Persona> personas = service.listar();
		model.addAttribute("personas", personas);
		return "index.html";
	}
	
}
