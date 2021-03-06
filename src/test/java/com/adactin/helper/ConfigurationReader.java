package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties ps;

	public ConfigurationReader() throws IOException {
		File f = new File("src\\test\\java\\com\\adactin\\property\\Adactin.property");
		FileInputStream fis = new FileInputStream(f);
		ps = new Properties();
		ps.load(fis);

	}
	
	public  String getProjectName() {
		String projectname = ps.getProperty("ProjectName");
		System.out.println(projectname);
		return projectname;
 
	}

	public String getBrowserName() {
		String broswername = ps.getProperty("BrowserName");
		System.out.println(broswername);
		return broswername;

	}

	public String getUrl() {
		String url = ps.getProperty("url");
		System.out.println(url);
		return url;
	}
	

	
}
