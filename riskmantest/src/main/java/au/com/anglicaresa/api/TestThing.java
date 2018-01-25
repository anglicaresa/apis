package au.com.anglicaresa.api;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class TestThing {
	private final static Logger logger = LogManager.getLogger(TestThing.class);
	
	public void doSomething() {
		logger.info("doSomething");
	}
}
