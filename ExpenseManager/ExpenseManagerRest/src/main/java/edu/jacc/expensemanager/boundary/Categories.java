package edu.jacc.expensemanager.boundary;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import edu.jacc.expensemanager.entities.Category;

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

	}

	public void persist(Category category) {
		em.persist(category);
	}

	public List<Category> getCategories() {
		TypedQuery<Category> query = em.createNamedQuery("Category.findAll", Category.class);
		List<Category> results = query.getResultList();
		return results;
	}

}
