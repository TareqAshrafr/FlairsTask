package stepDefinitions.APITest.stepDefention;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import stepDefinitions.APITest.testDefenition.APICommonTestDefenition;

public class APICommonStepDefenition {
    APICommonTestDefenition APICommonTestDefenition = new APICommonTestDefenition();

    @Given("I have the user credentials for user")
    public void iSetUrlAndEndPoint() {
        APICommonTestDefenition.setHeaders();
    }

    @Given("I set url {string} and end point {string}")
    public void iSetUrlAndEndPoint(String url, String endPoint) {
        APICommonTestDefenition.setUrlAndEndPoint(url, endPoint);
    }

    @And("I get body for Api call from {string}")
    public void iGetBodyForApiCallFrom(String fileName) {
        APICommonTestDefenition.buildBody(fileName);
    }

    @And("I perform {string} request")
    public void iPerformXreqest(String method) {
        APICommonTestDefenition.performXrequest(method);
    }

    @Then("I verify that the status code is {string}")
    public void iVerifyThatTheStatusCodeIs(String statusCode) {
        Assert.assertEquals(Integer.parseInt(statusCode), APICommonTestDefenition.getStatusCode());
    }

    @And("I store the id of created user")
    public void iStoreTheIdOfCreatedUser() {
        APICommonTestDefenition.storeIdOfUser();
    }

    @And("I clear All")
    public void iClearTheBody() {
        APICommonTestDefenition.clearBody();
    }

    @And("I build body with new ID")
    public void iBuildBodyWithNewId() {
        APICommonTestDefenition.buildBodyWithIdOfCreatedUser();
    }

}
