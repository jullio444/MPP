package lab5.prob1;

public interface FLyBehavior {

	default void fly() {
		System.out.println("  fly with wings");
	}
}
