package com.dl.Client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dl.Dao.HondaDao;
import com.dl.models.Honda;

public class Delete {

public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HondaDao hondaDao = (HondaDao)context.getBean("hondadao");
		
		Honda h = new Honda();
		h.setId(1);
		
		hondaDao.delete(h);
		System.out.println("Data Deleted: ");
		context.close();
	}
}
