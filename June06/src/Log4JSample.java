import org.apache.log4j.Level;
import org.apache.log4j.Logger;


/**
 * <br>
 * @author Anitha K N
 */
public class Log4JSample {
    protected static Logger logger = Logger.getLogger (Log4JSample.class);
    
    public static void main(String[] args) {
		System.out.println("WARN - Hello");
		System.out.println("ERROR - Hello");
		
		logger.info("This is an information message");
		logger.warn("This is a warning message");
		logger.error("This is an error message");
		logger.trace("this is a trace message");
		logger.debug("this is a debug message");
		logger.fatal("this is a fatal message");
		

	}
}