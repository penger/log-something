package log4j;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by gongp on 2018/4/2.
 * �ο������ļ�Ϊ log4j2.xml
 * Ĭ��Ϊconsoleappender ������ΪERROR
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
