package com.tutum.control.dispositivos.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tutum.control.dispositivos.models.dao.IImpresoraDao;
import com.tutum.control.dispositivos.models.entity.Impresora;

@Service
public class ImpresoraServiceImpl implements IImpresoraService {

	@Autowired
	private IImpresoraDao impresoraDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Impresora> findAll() {
		return (List<Impresora>) impresoraDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Impresora findById(Long id) {
		return impresoraDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Impresora save(Impresora impresora) {
		return impresoraDao.save(impresora);
	}

	@Override
	public void delete(Long id) {
		impresoraDao.deleteById(id);
		
	}
	
	

}
 