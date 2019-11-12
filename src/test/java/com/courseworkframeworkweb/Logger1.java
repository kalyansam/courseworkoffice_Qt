package com.courseworkframeworkweb;
import org.apache.logging.log4j.*;
public class Logger1 {
private static Logger log =LogManager.getLogger(Logger1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
log.error("unable to click on button");
log.fatal("Fatal error display");
log.info("successfully entered user name an password");
log.debug("Debug info displayed");
	}

}
