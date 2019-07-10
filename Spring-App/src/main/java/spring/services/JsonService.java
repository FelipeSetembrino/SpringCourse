package spring.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class JsonService {

	private List<JsonTest> jsonTests = new ArrayList<>(Arrays.asList(
			new JsonTest("A1", "A2", "A3"),
			new JsonTest("B1", "B2", "B3"),
			new JsonTest("C1", "C2", "C3"),
			new JsonTest("D1", "D2", "D3"),
			new JsonTest("E1", "E2", "E3")
		));
	
	public List<JsonTest> getAllJsonTests(){
		return jsonTests;
	}
	
	public JsonTest getJsonTest(String attrA) {
		return jsonTests.stream().filter(jT -> jT.getAttrA().equals(attrA)).findFirst().get();
	}
	
	public void addJsonTest(JsonTest jsonTest) {
		this.jsonTests.add(jsonTest);
	}

	public void updateJsonTest(JsonTest jsonTest, String attrA) {
		
		JsonTest jsonTestAux = getJsonTest(attrA);
		int index = jsonTests.indexOf(jsonTestAux);
		jsonTests.set(index, jsonTest);
		
	}

	public void deleteJsonTest(JsonTest jsonTest, String attrA) {
		
		JsonTest jsonTestAux = getJsonTest(attrA);
		int index = jsonTests.indexOf(jsonTestAux);
		jsonTests.remove(index);
		
	}
	
}
