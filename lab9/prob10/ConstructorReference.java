package lab9.prob10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

class Human {
	String name;
	int age;
	String gender;

	public Human(String name) {
		this.name = name;
	}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Human(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
	public static void main(String args[]) {
		Human[] list = { new Human("Joe", 35, "Male"), 
				         new Human("Jane", 45, "Female"), 
				         new Human("John", 30, "Male") };

		// Query 1 : Print only Female canditates names
		new ArrayList<>(Arrays.asList(list)).stream().filter(g -> g.getGender().equals("Female")).map(Human::getName)
				.forEach(System.out::println);

		// Query 2 : Create an object by choosing suitable Interface to the specified
		// constructors
		// (Totally 3 constructors)using fourth type of Method Reference ClassName::new.
		// Then print the object status
		Function<String, Human> f1 = Human::new;
		System.out.println("Constructor1-> "+f1.apply("Julius"));

		BiFunction<String, Integer, Human> f2 = Human::new;
		System.out.println("Constructor2-> "+f2.apply("Bobi Wine", 36));
		
		HumanInterface<String, Integer, String, Human> f3 = Human::new;
		System.out.println("Constructor3-> "+f3.createHuman("Bobi Wine", 36, "Male"));
		
		// Query 3 : Count the male candidates whose age is more than 30
		int count = (int) new ArrayList<>(Arrays.asList(list)).stream().filter(h->h.getGender().equals("Male") 
				                                      && h.getAge()>30).count();
		System.out.println("Count the male candidates whose age is more than 30: "+count);
		
		

	}

	interface HumanInterface<T, U, S, R> {
		R createHuman(T t, U u, S s);
	}

}
/**
 * 
Jane
Constructor1-> Human [name=Julius, age=0, gender=null]
Constructor2-> Human [name=Bobi Wine, age=36, gender=null]
Constructor3-> Human [name=Bobi Wine, age=36, gender=Male]
Count the male candidates whose age is more than 30: 1 
 * 
 */