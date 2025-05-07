package stepDefinitions.E2E.stepDefenetion;

import io.cucumber.java.en.When;
import stepDefinitions.E2E.testDefenition.DashboardTestDefinition;

public class DashBoardStepDefinition {
    DashboardTestDefinition dashboardTestDefinition = new DashboardTestDefinition();

    @When("I click on Admin tab")
    public void iClickOnAdminTab() {
        dashboardTestDefinition.clickOnAdminTab();
    }
}
