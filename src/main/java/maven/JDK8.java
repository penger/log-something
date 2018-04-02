package maven;

import java.util.Arrays;
import java.util.List;

/**
 * Created by gongp on 2018/4/2.
 */
public class JDK8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("gong", "peng");
        list.stream().forEach(System.out::println);
    }
}
