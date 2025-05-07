package Pages;

import org.openqa.selenium.By;

import java.util.Map;

public class AddUserPage extends PageObject {

    private static final By usernameField = By.xpath("//label[contains(text(),\"Username\")]/../../div[2]/input");
    private static final By passwordField = By.xpath("(//label[contains(text(),\"Password\")]/../../div[2]/input)[1]");
    private static final By confirmPasswordField = By.xpath("//label[contains(text(),\"Confirm Password\")]/../../div[2]/input");
    private static final By employeeNameField = By.xpath("//label[contains(text(),\"Employee Name\")]/../../div[2]/div/div/input");
    private static final By saveButton = By.xpath("//button[@type = 'submit']");
    private final String dropDownValue = "//div[@role='listbox']/*[contains(string(),'%x')]";
    private final String dropDown = "//label[contains(text(),\"%x\")]/../../div[2]/div/div/div";
    private final String employeeNameDropDownValue = "//div[@role = 'listbox']//*[contains(string(),'%x')]";


    public void addUser(Map<String, String> userDetails) {
        fillUserRoleAndStatus("User Role", userDetails.get("User Role"));
        fillUserRoleAndStatus("Status", userDetails.get("Status"));
        fillEmployeeName(userDetails.get("Employee Name"));
        fillUserName(userDetails.get("Username"));
        fillPassword(userDetails.get("Password"));
        fillConfirmPassword(userDetails.get("Password"));
        clickOnSaveButton();
    }

    private void clickOnSaveButton() {
        clickAndWaitForInvisibility(saveButton);
    }

    private void fillConfirmPassword(String password) {
        setText(confirmPasswordField, password);
    }

    private void fillPassword(String password) {
        setText(passwordField, password);
    }

    private void fillUserName(String username) {
        setText(usernameField, username);
    }

    private void fillUserRoleAndStatus(String fieldName, String value) {
        click(By.xpath(dropDown.replace("%x", fieldName)));
        click(By.xpath(dropDownValue.replace("%x", value)));
    }

    private void fillEmployeeName(String value) {
        setText(employeeNameField, value);
        click(By.xpath(employeeNameDropDownValue.replace("%x", value)));
    }


}
