package lab8.day2.prob1;

import java.util.Objects;
import java.util.function.Predicate;

public class MyClass {
	private int x = 8;
	private String y = "abc";
	
	Predicate<MyClass> p1 = (MyClass myClass) -> this.equals(myClass); //Using lambda
	Predicate<MyClass> p2 = this::equals; //Using method reference

	MyClass(String y, int x){
		this.y = y;
		this.x = x;
	}
	
	public int getX() {
		return x;
	}

	public String getY() {
		return y;
	}

	public void myMethod(MyClass cl) {
		System.out.println("Is this instance equal to MyClass instance? " + p1.test(cl));
		System.out.println("Is this instance equal to MyClass instance? " + p2.test(cl));

	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)return false;
		if(obj.getClass()!= this.getClass()) return false;
		MyClass m = (MyClass) obj;
		return this.getY().equals(m.getY()) && this.getX()==m.getX();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getY(), getX());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass c1 = new MyClass("abc", 8);
		MyClass c2 = new MyClass("xyz", 10);
		
		c1.myMethod(c1);
		System.out.println("-------------------------------------------------");
		c2.myMethod(c2);
	}

}

/**Sample Output****

Is this instance equal to MyClass instance? true
Is this instance equal to MyClass instance? true
-------------------------------------------------
Is this instance equal to MyClass instance? true
Is this instance equal to MyClass instance? true

*/