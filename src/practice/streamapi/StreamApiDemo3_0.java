package practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * This is detailed version where each of the interfaces used are declared and
 * implementation is provided
 *
 *
 * @author Sandeep Raikar
 */
public class StreamApiDemo3_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values = Arrays.asList(10, 14, 20, 25, 28, 32, 46,50);
		//Compute sum of numbers divisible by 5.
		
		//Naive approach!
		/*int result =0;
		for(int i : values){
			if(i%5==0){
				result+=i;
			}
		}
		System.out.println(result);
		*/
		
		Predicate<Integer> p = new Predicate<Integer>() {

			public boolean test(Integer t) {
				return t%5==0;
			}
		
		};
		
		System.out.println(values.stream()
								 .filter(p)
								 .reduce(0,(c,e)->c+e));	
		
		/*//Using Stream api and filter predicate interface
		System.out.println(values.stream()
								 .filter(i->i%5==0)
								 .reduce(0,(c,e)->c+e));
		*/
		
	}

}
