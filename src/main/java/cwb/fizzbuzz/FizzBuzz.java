package cwb.fizzbuzz;

import java.math.BigInteger;
import java.util.function.Function;

public final class FizzBuzz {
	private FizzBuzz() {
		throw new IllegalStateException();
	}

	public static String play(final BigInteger arg) {
		String out = null;

		Function<Integer, Boolean> f = divider -> (arg
				.mod(BigInteger.valueOf(divider)) == BigInteger.ZERO);

		if (f.apply(3)) {
			out = "fizz";

			if (f.apply(5)) {
				out += " buzz";
			}
		} else if (f.apply(5)) {
			out = "buzz";
		} else {
			out = arg.toString();
		}

		return out;
	}
}
