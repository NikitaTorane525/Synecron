Feature: Validating place API's 
@ratesapi 
Scenario: 
	Verify if the Rates API for specific date foreign exchange rates works fine 
	Given  Rates API
	When  user calls "ratesapi" with "get" http request
	Then  the Api call is success with status code 200
	And  "status" in response body is "OK"
	And  "base" in response body is "EUR"
	And  "date" in response body is "2010-01-11"
	