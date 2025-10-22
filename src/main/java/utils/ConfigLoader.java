package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
    private static String filePath = "src/main/resources/config.properties";
    private static Properties config= new Properties();

    public static String getAppUrl(){
        try {
            FileInputStream fis = new FileInputStream(filePath);
            config.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return config.getProperty("app_url");
    }
}
