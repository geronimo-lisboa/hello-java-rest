package don.geronimo.testeGradle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//Baseado em https://spring.io/guides/gs/rest-service/
@RestController
public class GreetingController {
	@RequestMapping(name="/greeting", method=RequestMethod.GET)
	public Greeting greeting() {
		return new Greeting(1, "hello mothafockae");
	}
}
