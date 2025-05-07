package Pages;

import org.openqa.selenium.By;

public class AdminPage extends PageObject {
    private static final By addButton = By.xpath("//button[contains(string(),\"Add\")]");
    //sreach
    private static final By userNameSearchField = By.xpath("//label[contains(string(),\"Username\")]/../../div[2]/input");
    private static final By searchButton = By.xpath("//button[@type=\"submit\"]");
    private static final By resetButton = By.xpath("//button[contains(string(),'Reset')]");
    //number of records
    private static final By numberOfRecordsText = By.xpath("//span[contains(string(),\"Found\")]");
    //delete
    private static final By deleteIcon = By.xpath("//i[@class=\"oxd-icon bi-trash\"]/..");
    private static final By confirmDeleteButton = By.xpath("//i[@class=\"oxd-icon bi-trash oxd-button-icon\"]/..");
    private static Integer oldNumberOfRecords;

    public int getNumberOfRecords() {
        String numberOfRecordsAsString = getText(numberOfRecordsText).replaceAll("[A-Za-z,\\((.+?)\\)]", "").trim();
        return Integer.parseInt(numberOfRecordsAsString);
    }

    public void clickOnSearchButton() {
        click(searchButton);
    }

    public void clickOnAddButton() {
        click(addButton);
    }

    public void searchWithUserName(String username) {
        setText(userNameSearchField, username);
        clickOnSearchButton();
    }

    private void clickOnConfirmDeleteButton() {
        click(confirmDeleteButton);
    }

    private void clickOnDeleteIcon() {
        click(deleteIcon);
    }

    public void deleteCreatedUser() {
        clickOnDeleteIcon();
        clickOnConfirmDeleteButton();
        clickOnResetButton();
    }

    public void clickOnResetButton() {
        click(resetButton);
    }

    public void storeRecordsNumber() {
        String recordNumbers = getText(numberOfRecordsText).replaceAll("[A-Za-z,\\((.+?)\\)]", "").trim();
        oldNumberOfRecords = Integer.parseInt(recordNumbers);
    }

    public int getOldNumberOfRecords() {
        return oldNumberOfRecords;
    }
}
