package lab5.prob4;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class CustOrderFactory {

	public Customer createCustomer(String customerName, List<String> orderList) {
		Customer cust = new Customer(customerName);
		Order order = Order.newOrder(cust, LocalDate.now());
		
		Iterator<String> it = orderList.iterator();
		while(it.hasNext()) {
			String item = it.next();
			order.addItem(item);
		}
		return cust;
	}
	

}

