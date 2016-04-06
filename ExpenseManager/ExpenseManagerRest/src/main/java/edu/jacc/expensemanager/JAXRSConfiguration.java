package edu.jacc.expensemanager;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import edu.jacc.expensemanager.boundary.CategoriesResource;

@ApplicationPath("/expensemanager")
public class JAXRSConfiguration extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> s = new HashSet<Class<?>>();
		s.add(CategoriesResource.class);
		s.add(RootResource.class);
		return s;
	}
}
