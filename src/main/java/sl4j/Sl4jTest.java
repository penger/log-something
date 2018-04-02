package sl4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by gongp on 2018/4/2.
 */
public class Sl4jTest {
    final static Logger logger = LoggerFactory.getLogger(Sl4jTest.class);

    public static void main(String[] args) {

        logger.trace("trace level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");

    }
}
