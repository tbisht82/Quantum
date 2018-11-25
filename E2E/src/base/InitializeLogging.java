package base;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class InitializeLogging {
	public static Logger log = Logger.getLogger("Regression");
	// static block
	static{
		//PropertiesConfigurator is used to configure logger from properties file
		PropertyConfigurator.configure("D:\\quantum\\quantum_e2e\\src\\files\\input\\log4j.properties");
		
		//log the message to file
		log.trace("Logging Initialized");
	}
}