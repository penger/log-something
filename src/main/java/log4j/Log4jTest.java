package log4j;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by gongp on 2018/4/2.
 * 参考配置文件为 log4j2.xml
 * 默认为consoleappender ，级别为ERROR
 */
public class Log4jTest {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(Log4jTest.class);
        logger.debug("Debug Level");
        logger.info("Info Level");
        logger.warn("Warn Level");
        logger.error("Error Level");

    }
}
