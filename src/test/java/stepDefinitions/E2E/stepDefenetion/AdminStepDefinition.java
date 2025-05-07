package stepDefinitions.E2E.stepDefenetion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import stepDefinitions.E2E.testDefenition.AdminTestDefenition;

public class AdminStepDefinition {
    AdminTestDefenition adminTestDefenition = new AdminTestDefenition();

    @And("I search for username {string}")
    public void iSearchForUserName(String username) {
        adminTestDefenition.searchWithUserName(username);
    }

    @And("I delete created user")
    public void iDeleteCreatedUser() {
        adminTestDefenition.deleteCreatedUser();
    }

    @Then("I verify that the user is added")
    public void iVerifyThatTheUserIsAdded() {
        Assert.assertEquals(adminTestDefenition.getOldNumberOfRecords() + 1, adminTestDefenition.getNumberOfRecords());
    }

    @Then("I verify that the user is deleted")
    public void iVerifyThatTheUserIsDeleted() {
        Assert.assertEquals(adminTestDefenition.getOldNumberOfRecords() - 1, adminTestDefenition.getNumberOfRecords());
    }
}
