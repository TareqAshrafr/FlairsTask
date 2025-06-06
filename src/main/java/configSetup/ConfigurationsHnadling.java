package configSetup;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationsHnadling {
    private static Properties properties;

    public static void initializeOfConfiguration(String configPath) {
        properties = new Properties();
        try {
            InputStream inputStream = new FileInputStream(configPath);
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Properties getProperties() {
        return properties;
    }
}
