package com.tutum.control.dispositivos.models.services;

import com.tutum.control.dispositivos.models.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);
}
