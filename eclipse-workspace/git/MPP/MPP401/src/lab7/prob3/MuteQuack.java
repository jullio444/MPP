package lab7.prob3;

public class MuteQuack implements QuackBehavior {
	
	@Override
	public void quack() {
		System.out.println("Cannot quarck");
	}

}
