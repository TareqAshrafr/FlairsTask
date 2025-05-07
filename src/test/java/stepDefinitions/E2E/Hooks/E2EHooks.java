package stepDefinitions.E2E.Hooks;

import configSetup.ConfigurationsHnadling;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import Helpers.Driver;

public class E2EHooks {
    private static final String configPath = "src/test/resources/configE2E.properties";

    @After
    public static void closeDriver() {
        Driver.closeDriver();
    }

    @Before("@E2E")
    public void startDriver() {
        ConfigurationsHnadling.initializeOfConfiguration(configPath);
        if (ConfigurationsHnadling.getProperties().get("browser").toString().equalsIgnoreCase("Chrome")) {
            String url = ConfigurationsHnadling.getProperties().get("targetUrl").toString();
            String driverPath = ConfigurationsHnadling.getProperties().get("driverPath").toString();
            Driver.startChromeDriver(url, driverPath);
        }
    }
}
