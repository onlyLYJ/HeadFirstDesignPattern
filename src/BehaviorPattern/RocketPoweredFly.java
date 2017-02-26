package BehaviorPattern;
import static util.Print.*;

public class RocketPoweredFly implements FlyBehavior {

	@Override
	public void fly() {
		println("Rocketing...");
	}

}
