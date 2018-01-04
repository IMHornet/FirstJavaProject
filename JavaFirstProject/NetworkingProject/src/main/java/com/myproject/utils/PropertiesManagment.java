package com.myproject.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesManagment {
	
	private String host;
	private String port;
	private String fileName;

	InputStream input = null;
	Properties prop = new Properties();

	public PropertiesManagment() {
		try {
			fileName = "config.properties";
			input = PropertiesManagment.class.getClassLoader().getResourceAsStream(fileName);

			if (input == null) {
				System.out.println("Sorry, unable to find " + fileName);
				return;
			}

			prop.load(input);
			host = prop.getProperty("Host");
			port = prop.getProperty("Port");

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public String getHost() {
		return host;
	}
	
	public String getPort() {
		return port;
	}	
}
	
