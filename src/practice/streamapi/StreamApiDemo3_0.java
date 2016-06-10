package practice.streamapi;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sandeep Raikar
 */
public class StreamApiDemo3_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values = Arrays.asList(10, 14, 20, 25, 28, 32, 46,50);
		//Compute sum of numbers divisible by 5.
		
		//Naive approach!
		int result =0;
		for(int i : values){
			if(i%5==0){
				result+=i;
			}
		}
		System.out.println(result);
		
		//Using Stream api and filter predicate interface
		System.out.println(values.stream().filter(i->i%5==0).reduce(0,(c,e)->c+e));
		
		
	}

}
