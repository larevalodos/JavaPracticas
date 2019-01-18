package logTest;

import org.apache.log4j.Logger;

import org.apache.log4j.xml.DOMConfigurator;
public class Log4J_Main {
	
    public static void main(String[] args)
    {
	     Logger logger = Logger.getLogger(logTest.Log4J_Main.class);
	 

	        //DOMConfigurator is used to configure logger from xml configuration file
	        DOMConfigurator.configure("log4j.xml");
	 
	        //Log in console in and log file
	        logger.debug("Log4j appender configuration is successful !!");
	    }
	}
