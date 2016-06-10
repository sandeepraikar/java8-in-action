package practice.defaultMethods;

public class Main {

	public static void main(String args[]){
		Actor act = new Hero();
		act.act();
		act.dance();
		act = new Villain();
		act.dance();
	}
}
