package com.tutum.control.dispositivos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.tutum.control.dispositivos.models.entity.Impresora;
import com.tutum.control.dispositivos.models.services.IImpresoraService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ImpresoraRestController {
	
	@Autowired
	private IImpresoraService impresoraService;
	
	@GetMapping("/impresoras")
	public List<Impresora> index(){
		return impresoraService.findAll();
	}
	
	@GetMapping("/impresoras/{id}")
	public Impresora show(@PathVariable Long id) {
		return impresoraService.findById(id);
	}
	
	@PostMapping("/impresoras")
	@ResponseStatus(HttpStatus.CREATED)
	public Impresora create(@RequestBody Impresora impresora) {
		return impresoraService.save(impresora);
	}
	
	@PutMapping("/impresoras/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Impresora update(@RequestBody Impresora impresora, @PathVariable Long id) {
		Impresora impresoraActual = impresoraService.findById(id);
		impresoraActual.setNombre(impresora.getNombre());
		impresoraActual.setModelo(impresora.getModelo());
		impresoraActual.setSerie(impresora.getSerie());
		impresoraActual.setIp(impresora.getIp());
		impresoraActual.setMac(impresora.getMac());
		impresoraActual.setEdificio(impresora.getEdificio());
		impresoraActual.setUbicacion(impresora.getUbicacion());
		
		return impresoraService.save(impresoraActual);
				
	}
	
	@DeleteMapping("/impresoras/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		impresoraService.delete(id);
	}
	
	

}
