package com.dl.Client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.dl.Dao.HondaDao;
import com.dl.models.Honda;

public class Insert {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HondaDao hondaDao = (HondaDao)context.getBean("hondadao");
		
		Honda h = new Honda();
		h.setId(007);
		h.setBikeName("Jawa");
		h.setBikeColor("Red");
		h.setCc(350l);
		
		int create = hondaDao.create(h);
		System.out.println("Data is created " +create);
		
		context.close();

	}

}
