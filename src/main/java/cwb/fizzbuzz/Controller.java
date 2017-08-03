package cwb.fizzbuzz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String root() {
		return "<h1>hello</h1>";
	}
}
