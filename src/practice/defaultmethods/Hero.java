package practice.defaultmethods;

public class Hero implements Actor{

	@Override
	public void act() {
		System.out.println("I can act");
		
	}

	@Override
	public void speak() {
		System.out.println("I can act");
		
	}
	
	public void dance(){
		System.out.println("I can dance only on Bollywwod songs");
	}

}
