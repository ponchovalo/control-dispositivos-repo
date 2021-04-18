package com.tutum.control.dispositivos.models.entity;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "controltoner")
public class ControlToner implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	private Long contador109;
	private Long contador124;
	private Long contador102;
	private String toner;
	
	private Long impresora_id;
	

	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	@JoinColumn(name = "usuario_id", referencedColumnName = "id")
	private Usuario usuario;

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Long getContador109() {
		return contador109;
	}


	public void setContador109(Long contador109) {
		this.contador109 = contador109;
	}


	public Long getContador124() {
		return contador124;
	}


	public void setContador124(Long contador124) {
		this.contador124 = contador124;
	}


	public Long getContador102() {
		return contador102;
	}


	public void setContador102(Long contador102) {
		this.contador102 = contador102;
	}


	public String getToner() {
		return toner;
	}

	public void setToner(String toner) {
		this.toner = toner;
	}


	public Long getImpresora_id() {
		return impresora_id;
	}


	public void setImpresora_id(Long impresora_id) {
		this.impresora_id = impresora_id;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}





	private static final long serialVersionUID = 1L;

}
