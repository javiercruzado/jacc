package edu.jacc.expensemanager.boundary;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.jacc.expensemanager.entities.Category;

/**
 * Session Bean implementation class CategoriesResource
 */
@Stateless
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Path("categories")
public class CategoriesResource {//

	@Inject
	Categories categories;

	/**
	 * Default constructor.
	 */
	public CategoriesResource() {
		// TODO Auto-generated constructor stub
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void insertCategory(Category category) {
		categories.persist(category);
	}

	@GET
	@Path("list")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Category> getCategories() {
		return categories.getCategories();
	}

}
