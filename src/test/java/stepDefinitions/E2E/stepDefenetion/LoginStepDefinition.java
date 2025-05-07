package stepDefinitions.E2E.stepDefenetion;

import io.cucumber.java.en.Given;
import stepDefinitions.E2E.testDefenition.LoginTestDefinition;

public class LoginStepDefinition {
    LoginTestDefinition loginTestDefinition = new LoginTestDefinition();

    @Given("Login to page using {string},{string}")
    public void loginToPage(String userName, String password) {
        loginTestDefinition.login(userName, password);
    }
}
