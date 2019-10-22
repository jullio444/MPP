package lab9.prob9;

import java.util.Arrays;
import java.util.List;

public class Dish {

	private final String name;
	private final boolean vegetarian;
	private final int calories;
	private final Type type;

	public Dish(String name, boolean vegetarian, int calories, Type type) {
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public int getCalories() {
		return calories;
	}

	public Type getType() {
		return type;
	}

	public enum Type {
		MEAT, FISH, OTHER
	}

	@Override
	public String toString() {
		return name;
	}

	public static final List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
			new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
			new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
			new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
			new Dish("prawns", false, 400, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));

	public static boolean isVegetarianAvailable(List<Dish> dishes) {
		return dishes.stream().anyMatch(Dish::isVegetarian);
	}

	public static boolean anyHealthyMenu(List<Dish> dishes) {
		return dishes.stream().map(a -> a.getCalories() < 1000).findAny().get();
	}

	public static boolean anyUnhealthyMenu(List<Dish> dishes) {
		return dishes.stream().map(a -> a.getCalories() > 1000).findAny().get();
	}

	public static Dish firstItemMeat(List<Dish> dishes) {
		return dishes.stream().filter(x -> x.type.equals(Type.MEAT)).findFirst().get();
	}

	public static int calculateTotalCalories(List<Dish> dishes) {
		return dishes.stream().map(Dish::getCalories).reduce(0, (a, b) -> a + b);
	}


	public static void main(String[] args) {
		System.out.println("Is there any Vegetarian meal available?  " + isVegetarianAvailable(menu));
		System.out.println("Is there any healthy menu have calories less than 1000?  " + anyHealthyMenu(menu));
		System.out.println("Is there any unhealthy menu have calories greater than 1000?  " + anyUnhealthyMenu(menu));
		System.out.println("The first item for the type of MEAT: " + firstItemMeat(menu));
		System.out.println("Total Calories in the menu using reduce: " + calculateTotalCalories(menu));
	}
}
/**Sample Output
 * 
Is there any Vegetarian meal available?  true
Is there any healthy menu have calories less than 1000?  true
Is there any unhealthy menu have calories greater than 1000?  false
The first item for the type of MEAT: pork
Total Calories in the menu using reduce: 4300
*/