package com.hibernate.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.demo.model.Person;

@Repository
@Transactional
public class PersonDao extends GenericDAO<Person> {
	
	@Autowired
	private SessionFactory factory;
	
	private Session getSession() {
		Session session= factory.getCurrentSession();
		if(session == null) {
			session = factory.openSession();
		}
		
		return session;
	}
	
	
	public void savePerson(Person person) {
		getSession().save(person);
	}
	
	
	public Class<? extends Session> getPerson(){
		//return getSession().createCriteria(Person.class).list();
		
		return getSession().getClass();//.createCriteria(Person.class).list();
	}

}
