package practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * This is detailed version where each of the interfaces used are declared and
 * implementation is provided
 *
 *
 * @author Sandeep Raikar
 */
public class StreamApiDemo2_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values = Arrays.asList(1, 2, 3, 5, 6, 8, 9);

		Function<Integer, Integer> f = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {

				return t * 2;
			}
		};

		Stream<Integer> s = values.stream();
		// Step 1: Create a function Mapper

		Stream<Integer> s1 = s.map(f);
		// Step 2: Verify if map function
		// s1.forEach(System.out::println);

		// BinaryOperator is a functional interface and we will be using the
		// BiFunciton interface to provide the implementation for summing up all
		// the values.
		BinaryOperator<Integer> accumulator = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}

		};
		// Step 3: Write reduce function for the stream s1(where we have already
		// done map operation)
		Integer result = (Integer) s1.reduce(0, accumulator); // Define the
																// accumulator
																// and pass the
		// reference. Here the first parameter is
		// the identity element which will hold the
		// initial default value and would be
		// further used for computation
		System.out.println(result);

	}

}
