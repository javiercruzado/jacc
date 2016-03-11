package edu.jacc.expensemanager.boundary;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class Categories
 */
@Stateless
public class Categories {

	@PersistenceContext
	EntityManager em;

	/**
	 * Default constructor.
	 */
	public Categories() {
		// TODO Auto-generated constructor stub
	}

}
