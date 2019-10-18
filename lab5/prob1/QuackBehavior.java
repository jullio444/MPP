package lab5.prob1;

public interface QuackBehavior {
	default void quack() {
		System.out.println("  quacking");
	}
}
