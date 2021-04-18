package com.tutum.control.dispositivos.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tutum.control.dispositivos.models.dao.IControlTonerDao;
import com.tutum.control.dispositivos.models.entity.ControlToner;

@Service
public class ControlTonerServiceImpl implements IControlTonerService {
	
	@Autowired
	private IControlTonerDao controlTonerDao; 

	@Override
	@Transactional(readOnly=true)
	public List<ControlToner> findAll() {
		return (List<ControlToner>) controlTonerDao.findAll() ;
	}

	@Override
	@Transactional(readOnly=true)
	public ControlToner findById(Long id) {
		return controlTonerDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public ControlToner save(ControlToner controlToner) {
		return controlTonerDao.save(controlToner);
	}

	@Override
	public void delete(Long id) {
		controlTonerDao.deleteById(id);
		
	}

}
