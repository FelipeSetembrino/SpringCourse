package controller.tests;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring.services.JsonService;
import spring.services.JsonTest;

@RestController
@ComponentScan({"spring.services"}) //para este caso utilizado para executar o @Service em outro package
public class ControllerJSON {
	
	@Autowired
	private JsonService jsonService;
	
	@RequestMapping("/service")
	public List<JsonTest> getService() {
		return jsonService.getAllJsonTests();
	}
	
	@RequestMapping("/service/{attrA}")
	public JsonTest getAttributeA(@PathVariable String attrA) {
		return jsonService.getJsonTest(attrA);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/service")
	public void addJsonTest(@RequestBody JsonTest jsonTest) {
		jsonService.addJsonTest(jsonTest);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/service/{attrA}")
	public void upDateJsonTest(@RequestBody JsonTest jsonTest, @PathVariable String attrA) {
		jsonService.updateJsonTest(jsonTest, attrA);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/service/{AttrA}")
	public void deleteJsonTest(@RequestBody JsonTest jsonTest, @PathVariable String AttrA) {
		jsonService.deleteJsonTest(jsonTest, AttrA);
	}
	
}
