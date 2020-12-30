package alpha;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.Logger;

public class Demo {
	//giving the path of the class for which I would like to  have logs
	private static Logger log=LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
		log.fatal("this is fatal");
		log.info("this is info");
		log.debug("this is debug");
		// TODO Auto-generated method stub

	}

}
