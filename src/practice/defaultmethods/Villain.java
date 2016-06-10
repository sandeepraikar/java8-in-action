package practice.defaultmethods;

public class Villain implements Actor{

	@Override
	public void act() {
		System.out.println("I can act");	
	}

	@Override
	public void speak() {
		System.out.println("I can speak");
	}
	
	public void takeRevenge(){
		System.out.println("I can take revenge");
	}

}
