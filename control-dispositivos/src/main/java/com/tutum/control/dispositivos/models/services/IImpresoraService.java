package com.tutum.control.dispositivos.models.services;

import java.util.List;

import com.tutum.control.dispositivos.models.entity.Impresora;

public interface IImpresoraService {
	
	public List <Impresora> findAll();
	
	public Impresora findById(Long id);
	
	public Impresora save(Impresora impresora);
	
	public void delete(Long id);
	
}
