package au.com.anglicaresa.api;

import java.io.*;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class FileReader {

	private final static Logger logger = LogManager.getLogger(FileReader.class);
	
	public void pulse() {
		logger.info("pulse");
		logger.trace("trace statement");
		logger.debug("debug statement");
		logger.warn("warn statement");
		logger.error("error statement");
	}
	
		
	public InputStream getFileAsStream(String path) {
		
		InputStream stream =null;
		try {
			logger.info("opening stream: " + path);
			stream = new FileInputStream(new File(path));
			logger.info("stream opened");
		} catch (FileNotFoundException e) {
			logger.error(e.getMessage());
			// e.printStackTrace();
		}
		return stream;
	}
	

}
