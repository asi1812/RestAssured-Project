package Utils;

import java.security.Key;
import java.util.Properties;

public class configReader {
    Properties properties;
    public static final String CONFIG_FILE_PATH = "config.properties";

    public configReader() {
        properties = new Properties();
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream(CONFIG_FILE_PATH));
        } catch (Exception e) {
            e.printStackTrace();
        }


}
    public String getProperty(String key) {
        return properties.getProperty(key);
    }
    public int getIntProperty(String key) {
        return Integer.parseInt(properties.getProperty(key));
    }
}


