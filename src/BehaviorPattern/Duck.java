package BehaviorPattern;

import static util.Print.*;

public class Duck {
	
	
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
		this.quackBehavior = null;
		this.flyBehavir = null;
	}

	private String name;

	


	public Duck(String name) {
		this.quackBehavior = null;
		this.flyBehavir = null;
		this.name = name;
	}




	public void performFly() {
		print(getClass().getSimpleName()+ " " + name + " is ready to fly. ");
		flyBehavir.fly();
	}

}
