package cwb.fizzbuzz;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@CrossOrigin
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public List<String> root(@RequestBody List<BigInteger> list) {
		return list.stream()
				.map(integer -> FizzBuzz.play(integer))
				.collect(Collectors.toList());
	}
}
