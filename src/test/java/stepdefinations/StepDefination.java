package stepdefinations;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class StepDefination extends Utils {
	RequestSpecification request;
	ResponseSpecification resspect;
	Response response;
	TestDataBuild testdata = new TestDataBuild();
	APIResources apiResource;
	JsonPath js;

	@Given("Rates API")
	public void rates_API() {
		RestAssured.useRelaxedHTTPSValidation();
	}

	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) {
		apiResource = APIResources.valueOf(resource);
		System.out.println(apiResource.getResource());
		resspect = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

		if (method.equalsIgnoreCase("POST")) {
			response = request.when().post(apiResource.getResource());
		} else if (method.equalsIgnoreCase("GET")) {
			response = request.when().get(apiResource.getResource());
		}
	}

	@Then("the Api call is success with status code {int}")
	public void the_Api_call_is_success_with_status_code(Integer int1) {
		assertEquals(response.getStatusCode(), 200);
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String Expectedvalue) {
		assertEquals(getJsonPath(response, keyValue), Expectedvalue);
	}

}
