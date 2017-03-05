package DuckClass;

import FlyBehavior.RocketPoweredFly;
import QuackBehavior.Quack;

public class SuperDuck extends Duck {

	
	public SuperDuck(String string) {
		super(string);
		setFlyBehavir(new RocketPoweredFly());
		setQuackBehavior(new Quack());
	}
}
