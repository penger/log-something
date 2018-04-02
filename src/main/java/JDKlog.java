import java.util.logging.Logger;

/**
 * Created by gongp on 2018/4/2.
 */
public class JDKlog {
    public static void main(String[] args) {
        Logger jdklog = Logger.getLogger("jdklog");
        jdklog.info("jdk logging ");
    }
}
