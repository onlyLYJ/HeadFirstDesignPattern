package BehaviorPattern;

import static util.Print.println;

public class NormalDuck extends Duck{

	
	
	
	public NormalDuck(String string) {
		super(string);
		setFlyBehavir(new FlyWithWings());
	}
	


	
}
