package StrategyPattern;

import static util.Print.println;

import FlyBehavior.FlyWithWings;
import QuackBehavior.Quack;

public class NormalDuck extends Duck{

	
	
	
	public NormalDuck(String string) {
		super(string);
		setFlyBehavir(new FlyWithWings());
		setQuackBehavior(new Quack());
	}
	


	
}
