package stepDefinitions.E2E.testDefenition;

import Pages.AdminPage;

public class AdminTestDefenition {
    AdminPage adminPage = new AdminPage();

    public int getNumberOfRecords() {
        return adminPage.getNumberOfRecords();
    }

    public void searchWithUserName(String username) {
        adminPage.clickOnResetButton();
        adminPage.storeRecordsNumber();
        adminPage.searchWithUserName(username);
    }

    public void deleteCreatedUser() {
        adminPage.deleteCreatedUser();
    }

    public int getOldNumberOfRecords() {
        return adminPage.getOldNumberOfRecords();
    }
}
