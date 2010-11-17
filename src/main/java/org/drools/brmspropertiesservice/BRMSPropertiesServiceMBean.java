package org.drools.brmspropertiesservice;

public interface BRMSPropertiesServiceMBean {
	void setBrmsPropertiesFilename(String filename);
	String getBrmsPropertiesFilename(); 
	void start();
	void stop();
}
