package lab5.prob1;

public abstract class Duck {
	FLyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	protected void quack() {
		quackBehavior.quack();
	}

	protected void fly() {
		flyBehavior.fly();
	}

	protected void swim() {
		System.out.println("  swimming");
	}

	protected abstract void display();
}
