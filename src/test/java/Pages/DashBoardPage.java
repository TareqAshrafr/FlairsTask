package Pages;

import org.openqa.selenium.By;

public class DashBoardPage extends PageObject {
    private static final By adminLink = By.linkText("Admin");

    public void clickOnAdminTab() {
        click(adminLink);
    }
}
