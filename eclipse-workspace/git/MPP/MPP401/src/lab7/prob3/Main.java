package lab7.prob3;

public class Main {

	public static void main(String[] args) {
		Duck[] ducks = { new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck()};
		for (Duck d : ducks) {
			System.out.println("--------------------------------------");
			System.out.println(d.getClass().getSimpleName());
			System.out.println("--------------------------------------");
			d.display();
			d.fly();
			d.quack();
			d.swim();
			System.out.println();
		}
	}

}

/*
--------------------------------------
MallardDuck
--------------------------------------
displaying
fly with wings
quacking
swimming

--------------------------------------
DecoyDuck
--------------------------------------
displaying
I will try to fly!!
Cannot quarck
swimming

--------------------------------------
RedheadDuck
--------------------------------------
displaying
fly with wings
quacking
swimming

--------------------------------------
RubberDuck
--------------------------------------
displaying
I believe I can fly!!!!!!!!!!
squeaking
swimming
 * */
 