package edu.jacc.expensemanager.boundary;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Session Bean implementation class CategoriesResource
 */
@Stateless
public class CategoriesResource {//

	@Inject
	Categories categories;

	/**
	 * Default constructor.
	 */
	public CategoriesResource() {
		// TODO Auto-generated constructor stub
	}

}
