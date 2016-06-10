package practice.defaultMethods;

public interface Actor {
	void act();
	void speak();
	default void dance(){
		System.out.println("I can dance from default method!");
	}
}
