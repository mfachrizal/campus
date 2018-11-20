package com.project.campus.model.mapped;

import java.io.Serializable;

import org.hibernate.SessionFactory;

public abstract class BaseDaoImpl<T extends Serializable> {
	
	private Class<T> clazz;
	
	public SessionFactory sessionFactory;
	

}
