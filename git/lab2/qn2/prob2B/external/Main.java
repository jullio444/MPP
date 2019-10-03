package lab2.qn2.prob2B.external;

import java.time.LocalDate;

import lab2.qn2.prob2B.Order;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order o1 = new Order(LocalDate.now(), 13, 980, 7);
		System.out.println(o1);
		//Add another OrderLine
		o1.addOrderLine(5, 890, 17);
		System.out.println(o1);
		//Print orderLines for the same order
		System.out.println(o1.getOrderLines());
	}

}
/***Sample Output**
 * 
 * 	Order [OrderNumber:51407 OrderDate:2019-10-02 OrderLine:[[13 980 7]]
 *	Order [OrderNumber:51407 OrderDate:2019-10-02 OrderLine:[[13 980 7, 5 890 17]]
 *	[13 980 7, 5 890 17]
 *
 *
 */