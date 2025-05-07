package stepDefinitions.E2E.testDefenition;

import Pages.DashBoardPage;

public class DashboardTestDefinition {
    DashBoardPage dashboardPage = new DashBoardPage();

    public void clickOnAdminTab() {
        dashboardPage.clickOnAdminTab();
    }

}
