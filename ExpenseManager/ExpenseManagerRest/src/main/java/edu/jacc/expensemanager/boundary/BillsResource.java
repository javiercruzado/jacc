package edu.jacc.expensemanager.boundary;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Path;

/**
 * Session Bean implementation class BillsResource
 */
@Stateless
@Path("bills")
public class BillsResource {

	@Inject
	Bills registrations;

	/**
	 * Default constructor.
	 */
	public BillsResource() {
		// TODO Auto-generated constructor stub
	}

}
