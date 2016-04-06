package edu.jacc.expensemanager.client.rest;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import edu.jacc.expensemanager.client.AppProperties;

public class JerseyClient {

	static String urlTarget = AppProperties.getString("app.urltarget"); //$NON-NLS-1$
	static String appPath = AppProperties.getString("app.apppath"); //$NON-NLS-1$

	static final WebTarget target = ClientBuilder.newClient().target(urlTarget).path(appPath);

	public String getStatus() {
		System.out.println(target.request(MediaType.TEXT_PLAIN).get(String.class));
		return target.request(MediaType.TEXT_PLAIN).get(String.class);
	}

}
