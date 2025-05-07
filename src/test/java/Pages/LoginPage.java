package Pages;

import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private static final By userNameTextField = By.name("username");
    private static final By passwordTextField = By.name("password");
    private static final By loginButton = By.xpath("//button[@type = 'submit']");

    public void enterUserName(String userName) {
        setText(userNameTextField, userName);
    }

    public void enterPassword(String password) {
        setText(passwordTextField, password);
    }

    public void clickOnLoginButton() {
        click(loginButton);
    }
}
