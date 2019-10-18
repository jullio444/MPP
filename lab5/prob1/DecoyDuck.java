package lab5.prob1;

public class DecoyDuck extends Duck{
	
	
	public DecoyDuck() {
		flyBehavior = new CannotFly();
		quackBehavior = new MuteQuack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("  displaying");
	}
}
