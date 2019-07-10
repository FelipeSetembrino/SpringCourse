package controller.tests;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerA {
	@RequestMapping("/controllerA")
	public String welcome() {
		return "Welcome to Controller A";
	}
}
