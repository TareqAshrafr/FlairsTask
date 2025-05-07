package stepDefinitions.E2E.testDefenition;


import Pages.AddUserPage;
import Pages.AdminPage;
import io.cucumber.datatable.DataTable;

import java.util.Map;

public class AddUserTestDefinition {
    AddUserPage addUserPage = new AddUserPage();
    AdminPage adminPage = new AdminPage();

    public void addUser(DataTable userDetailsTable) {
        Map<String, String> userDetails = userDetailsTable.transpose().asMap(String.class, String.class);
        adminPage.storeRecordsNumber();
        adminPage.clickOnAddButton();
        addUserPage.addUser(userDetails);
    }
}
