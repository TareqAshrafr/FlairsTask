package stepDefinitions.E2E.testDefenition;

import Pages.LoginPage;

public class LoginTestDefinition {

    LoginPage loginPage = new LoginPage();

    public void login(String userName, String password) {
        loginPage.enterUserName(userName);
        loginPage.enterPassword(password);
        loginPage.clickOnLoginButton();
    }
}
