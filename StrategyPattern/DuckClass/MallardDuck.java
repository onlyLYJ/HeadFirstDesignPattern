package DuckClass;

import static util.Print.println;

import FlyBehavior.FlyNoWay;
import QuackBehavior.Squack;

public class MallardDuck extends Duck{


	public MallardDuck(String string) {
		super(string);
		setFlyBehavir(new FlyNoWay());
		setQuackBehavior(new Squack());
	}
	


	
}
