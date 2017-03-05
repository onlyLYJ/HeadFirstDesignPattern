package DuckClass;

import static util.Print.*;

import FlyBehavior.FlyBehavior;
import QuackBehavior.QuackBehavior;

public abstract class Duck {
	
	
	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}




	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}




	public FlyBehavior getFlyBehavir() {
		return flyBehavir;
	}




	public void setFlyBehavir(FlyBehavior flyBehavir) {
		this.flyBehavir = flyBehavir;
	}




	QuackBehavior quackBehavior;
	FlyBehavior flyBehavir;
	

	public Duck() {
	}

	private String name;

	


	public Duck(String name) {
		this.quackBehavior = null;
		this.flyBehavir = null;
		this.name = name;
	}

	public void performFly() {
		flyBehavir.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void display() {
		println(getClass().getSimpleName() + " " + name);
	}
	

}
