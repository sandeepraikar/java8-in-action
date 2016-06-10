package practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamApiDemo {

	public static void main(String args[]){
		List<Integer> values = Arrays.asList(1,2,3,5,6,8,9);
		
		Consumer<Integer> c = new Consumer<Integer>(){

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
			
		};
		//Detailed implmentation of how consumer interface is used!
		values.forEach(c);
		
		//Using Lambda expression
		values.forEach(i->System.out.println(i));
		
		//Using method reference
		values.forEach(System.out::println);
	
		//lambda
		values.forEach(i-> doubleIt(i));
		
		//using call by method reference
		values.forEach(StreamApiDemo::doubleIt);			

	}
	
	public static void doubleIt(int i){
		System.out.println(i*2);
	}
}
