package BehaviorPattern;

public class SimUDuckApp {

	public static void main(String[] args) {
		Duck aDuck = new NormalDuck("John");
		Duck sDuck = new SuperDuck("Steve");
		
		aDuck.performFly();
		sDuck.performFly();
		
		aDuck.setFlyBehavir(new RocketPoweredFly());
		aDuck.performFly();

	}

}
