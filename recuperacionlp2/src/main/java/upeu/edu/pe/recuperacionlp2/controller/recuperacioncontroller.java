package upeu.edu.pe.recuperacionlp2.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.recuperacionlp2.service.recuperacionservice;

@RestController
@RequestMapping("/api/recuperacion")
@CrossOrigin({"*"})

public class recuperacioncontroller {
	@Autowired
	private recuperacionservice  recuperacionService;
	
	 @GetMapping("/Readcantidadclienteregion")
	 public List<Map<String, Object>> Readcantidadclienteregion() {
			return recuperacionService.Readcantidadclienteregion();
		};
		
	@GetMapping("/Readordenesporterritorio")
	 public List<Map<String, Object>> Readordenesporterritorio() {
			return recuperacionService.Readordenesporterritorio();
		};

}
