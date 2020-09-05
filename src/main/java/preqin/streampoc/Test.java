package preqin.streampoc;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println("hello world");
        Properties config=new Properties();
        try (InputStream configStream=Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("config.properties")) {
            config.load(configStream);
        }
        System.out.println(config.getProperty("name"));
    }
}
