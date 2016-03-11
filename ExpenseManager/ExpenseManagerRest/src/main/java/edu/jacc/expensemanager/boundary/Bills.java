package edu.jacc.expensemanager.boundary;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class Bills
 */
@Stateless
public class Bills {

	@PersistenceContext
	EntityManager em;

	/**
	 * Default constructor.
	 */
	public Bills() {
		// TODO Auto-generated constructor stub
	}

}
