package com.tutum.control.dispositivos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tutum.control.dispositivos.models.entity.ControlToner;
import com.tutum.control.dispositivos.models.services.IControlTonerService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ControlTonerRestController {
	
	@Autowired
	private IControlTonerService controlTonerService;
	 
	@GetMapping("/controltoner")
	public List<ControlToner> index(){
		return controlTonerService.findAll();
	}
	
	@PostMapping("/controltoner")
	@ResponseStatus(HttpStatus.CREATED)
	public ControlToner create(@RequestBody ControlToner controltoner) {
		System.out.println(controltoner.getImpresora_id());
		System.out.println(controltoner.getUsuario());
		return controlTonerService.save(controltoner);
	}

}
