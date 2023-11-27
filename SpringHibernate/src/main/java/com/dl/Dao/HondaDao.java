package com.dl.Dao;

import com.dl.models.Honda;

public interface HondaDao {
	
	public int create(Honda honda);
	public void update(Honda honda);
	public void delete(Honda honda);
	

}
