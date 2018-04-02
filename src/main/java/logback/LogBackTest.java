package logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gongp on 2018/4/2.
 */
public class LogBackTest {

    static final Logger logger = LoggerFactory.getLogger(LogBackTest.class);

    public static void main(String[] args) {
        logger.debug("Debug Level");
        logger.info("Info Level");
        logger.warn("Warn Level");
        logger.error("Error Level");
    }
}
