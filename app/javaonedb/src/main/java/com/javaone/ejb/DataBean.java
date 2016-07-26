package com.javaone.ejb;

import java.util.Date;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.javaone.jpa.Data;

/**
 * Session Bean implementation class DataBean
 */
@Stateless
@LocalBean
public class DataBean {

	@PersistenceContext
	EntityManager em;
	
    /**
     * Default constructor. 
     */
    public DataBean() {
        // TODO Auto-generated constructor stub
    }
    
    @SuppressWarnings("unchecked")
	public List<Data> getData(){
    	return em.createNamedQuery(Data.FIND_ALL).getResultList();
    }
    
    public void create(){
    	Data data = new Data();
    	data.setNameData(new Date().toString());
    	em.persist(data);
    }

}
