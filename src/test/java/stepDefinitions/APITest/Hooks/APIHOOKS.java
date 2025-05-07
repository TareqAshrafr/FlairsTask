package stepDefinitions.APITest.Hooks;

import configSetup.ConfigurationsHnadling;
import io.cucumber.java.Before;
import stepDefinitions.APITest.testDefenition.APICommonTestDefenition;

public class APIHOOKS {
    private static final String configPath = "src/test/resources/APIConfig.properties";

    @Before("@BE")
    public static void readConfigFile() {
        ConfigurationsHnadling.initializeOfConfiguration(configPath);
        APICommonTestDefenition.setProperties(ConfigurationsHnadling.getProperties());
    }
}
