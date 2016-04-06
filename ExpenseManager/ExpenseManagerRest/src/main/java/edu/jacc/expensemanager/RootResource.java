package edu.jacc.expensemanager;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Path("/")
public class RootResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getStatus(@Context HttpServletRequest requestContext) {
		return "Connected to:" + requestContext.getServerName();
	}
}
