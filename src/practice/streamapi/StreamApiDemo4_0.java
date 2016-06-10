package practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * findFirst() 
 * orElse(n)
 *
 *
 * @author Sandeep Raikar
 */
public class StreamApiDemo4_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values = Arrays.asList(4, 14, 20, 25, 28, 32, 46,50);

		//Using Stream api and filter predicate interface
		System.out.println(values.stream()
								 .filter(i->i%5==0)
								 .map(i-> i*2)
								 .findFirst()
								 .orElse(0)
								 );
		
		
	}

}
