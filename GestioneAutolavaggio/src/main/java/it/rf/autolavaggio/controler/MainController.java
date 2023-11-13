package it.rf.autolavaggio.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import it.rf.autolavaggio.model.Utente;
import it.rf.autolavaggio.model.Veicolo;
import jakarta.servlet.http.HttpSession;

import org.springframework.ui.Model;

@Controller
public class MainController {
	
	@Autowired
	private GenericService service;
	
	@PostMapping(value = "/insert_veicolo")
	public String postMethodName(@ModelAttribute Veicolo v) {
		
		this.service.insertVeicolo(v);
		return "result";
	}
	
	
	
}
