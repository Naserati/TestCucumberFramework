package nazarov.stetsyuk.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ScenarioSteps extends BaseSteps {

    ScenarioSubSteps subSteps = new ScenarioSubSteps();

    @When("^выполнено нажатие на \"(.+)\"$")
    public void whenFieldIsClicked(String fieldName) {
        subSteps.stepFieldIsClicked(fieldName);
    }

    @When("^поле \"(.+)\" заполняется значением \"(.+)\"$")
    public void whenFieldIsFilledWithValue(String fieldName, String value) {
        subSteps.stepFieldIsFilledWithValue(fieldName, value);
    }

    @Then("^загружена страница \"(.+)\"$")
    public void whenPageIsLoaded(String page) {
        subSteps.stepPageIsLoaded(page);
    }
}
