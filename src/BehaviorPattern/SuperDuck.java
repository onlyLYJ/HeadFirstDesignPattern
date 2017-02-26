package BehaviorPattern;

public class SuperDuck extends Duck {

	
	public SuperDuck(String string) {
		super(string);
		setFlyBehavir(new RocketPoweredFly());
	}
}
