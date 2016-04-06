package edu.jacc.expensemanager.client;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class AppProperties {
	private static final String BUNDLE_NAME = "edu.jacc.expensemanager.client.app"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private AppProperties() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
