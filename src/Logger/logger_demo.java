package Logger;
import java.util.logging.*;
public class logger_demo {

	private final static Logger LOGGER= Logger.getLogger(logger_demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LOGGER.setLevel(Level.INFO);
		LOGGER.warning("Hello");

	}

}
