package practice.streamapi;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sandeep Raikar
 */
public class StreamApiDemo2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values = Arrays.asList(1, 2, 3, 5, 6, 8, 9);
		//version 1
		System.out.println(values.stream().map((i)-> i*2).reduce(0,(c,e)->c+e));
		
		//version 2
		System.out.println(values.stream().map((i)-> i*2).reduce(0,(c,e)->Integer.sum(c, e)));
		
		//version 3
		System.out.println(values.stream().map((i)-> i*2).reduce(0,Integer::sum));
		
		
	}

}
