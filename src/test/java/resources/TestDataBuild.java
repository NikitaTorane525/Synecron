package resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.RatesApi;

public class TestDataBuild {

	public RatesApi addPlacePayload(String name, String langauge, String address) throws JsonProcessingException {

		// Serialization
		RatesApi ratesApi = new RatesApi();
		Map<String, Double> rates = new HashMap<String, Double>();

		ratesApi.setBase("base_1");
		ratesApi.setDate("2010-01-11");

		rates.put("xyz", 2.1084);
		rates.put("abc", 1.1084);
		ratesApi.setRates(rates);

		return ratesApi;
	}

	public String deletePlacePayload(String placeId) {
		return "{\r\n    \"place_id\":\"" + placeId + "\"\r\n}";
	}

}
