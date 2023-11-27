package com.dl.Client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dl.Dao.HondaDao;
import com.dl.models.Honda;

public class Update {

public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HondaDao hondaDao = (HondaDao)context.getBean("hondadao");
		
		Honda h = new Honda();
		h.setId(1);
		h.setBikeName("Honda CBR");
		h.setBikeColor("Black");
		h.setCc(500.00);
		
		hondaDao.update(h);
		System.out.println("Data Updated: ");
		context.close();
	}
}
