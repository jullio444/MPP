package lab5.prob4.extpackage;

import java.util.ArrayList;
import java.util.List;

import lab5.prob4.CustOrderFactory;
import lab5.prob4.Customer;

public class Main {
	public static void main(String[] args) {
		CustOrderFactory factory = new CustOrderFactory();
		
		List<String> orderList = new ArrayList<>();
		orderList.add("Amazon Stick");
		orderList.add("Apple Watch");
		orderList.add("Google Nexus");
		orderList.add("Apple TV");
		
		Customer cust = factory.createCustomer("Group7", orderList);
		System.out.println(cust);
	}
}

/***Sample Output***
 * 
 * Customer:Group7 [OrderDate:2019-10-06: [Amazon Stick, Apple Watch, Google Nexus, Apple TV]]
 * 
 * */
		
