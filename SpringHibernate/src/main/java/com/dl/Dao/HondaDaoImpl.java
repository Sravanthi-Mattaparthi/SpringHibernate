package com.dl.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dl.models.Honda;

@Component("hondadao")
public class HondaDaoImpl implements HondaDao {
	
	@Autowired

	private HibernateTemplate hibernateTemplate;
	
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	//create method
	@Transactional
	public int create(Honda honda) {
		Integer i= (Integer)hibernateTemplate.save(honda);
	
		return i;
	}

	
	//update
	@Transactional
	public void update(Honda honda) {
		hibernateTemplate.update(honda);
		

	}

	
	//delete
	@Transactional
	public void delete(Honda honda) {
		hibernateTemplate.delete(honda);
		

	}

}
