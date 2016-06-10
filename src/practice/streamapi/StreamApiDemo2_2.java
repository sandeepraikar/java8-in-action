package practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Sandeep Raikar
 */
public class StreamApiDemo2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values = Arrays.asList(1, 2, 3, 5, 6, 8, 9);


		Stream<Integer> s = values.stream();
		// Step 1: Create a function Mapper

		Stream<Integer> s1 = s.map((i)-> i*2);
		// Step 2: Verify if map function
		// s1.forEach(System.out::println);

		// Step 3: Write reduce function for the stream s1(where we have already
		// done map operation)
		Integer result = (Integer) s1.reduce(0,(i,j)->i+j);
		System.out.println(result);

	}

}
