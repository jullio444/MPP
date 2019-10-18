package lab5.prob1;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehavior = new CannotFly();
		quackBehavior = new Squeak();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("  displaying");
	}
}
