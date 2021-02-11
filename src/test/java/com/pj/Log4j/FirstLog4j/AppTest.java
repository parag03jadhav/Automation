package com.pj.Log4j.FirstLog4j;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AppTest 
    
{
	static Logger l=LogManager.getLogger( AppTest.class);
	public static void main(String[] args) {
		
		System.out.println("All Logs");
		l.info("Info");
		l.error("error");
		l.fatal("Fatal");
		l.debug("debug");
	    l.warn("warn");
	
	}
   
}
