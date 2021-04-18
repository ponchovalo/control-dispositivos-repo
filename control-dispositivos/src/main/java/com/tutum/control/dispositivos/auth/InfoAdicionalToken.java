package com.tutum.control.dispositivos.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.tutum.control.dispositivos.models.entity.Usuario;
import com.tutum.control.dispositivos.models.services.IUsuarioService;


@Component
public class InfoAdicionalToken implements TokenEnhancer {
	
	@Autowired
	private IUsuarioService usuarioService; 

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		
		Usuario usuario = usuarioService.findByUsername(authentication.getName());
		
		Map<String, Object> info  = new HashMap<>();
		info.put("informacion_adicional", "Hola que tal: ".concat(authentication.getName()));
		
		info.put("id", usuario.getId());
		info.put("nombre_usuario", usuario.getNombre());
		info.put("puesto_usuario", usuario.getPuesto());
		
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		
		return accessToken;
	}

}
