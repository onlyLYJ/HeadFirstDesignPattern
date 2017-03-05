import DuckClass.Duck;
import DuckClass.NormalDuck;
import DuckClass.SuperDuck;
import FlyBehavior.RocketPoweredFly;


public class SimUDuckApp {

	public static void main(String[] args) {
		Duck aDuck = new NormalDuck("John");
		Duck sDuck = new SuperDuck("Steve");
		
		aDuck.performFly();
		sDuck.performFly();
		
		aDuck.setFlyBehavir(new RocketPoweredFly());
		aDuck.performFly();
		aDuck.display();

	}

}
