package com.tutum.control.dispositivos.models.services;

import java.util.List;

import com.tutum.control.dispositivos.models.entity.ControlToner;

public interface IControlTonerService {
	
	public List <ControlToner> findAll();
	
	public ControlToner findById(Long id);
	
	public ControlToner save(ControlToner controlToner);
	
	public void delete(Long id);
	
}
