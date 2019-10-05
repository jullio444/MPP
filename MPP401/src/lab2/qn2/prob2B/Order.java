package lab2.qn2.prob2B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Order {
	private int orderNum;
	private LocalDate orderDate;
	private List<OrderLine> orderLines;
	
	public Order(LocalDate orderDate, int lineNum,int price, int quantity){
		this.orderNum = setOrderNum(); //Set OrderNumber automatically
		this.orderDate = orderDate;
		orderLines = new ArrayList<>();
		orderLines.add(new OrderLine(lineNum, price, quantity, this));
		
	}
	//Automatically generate OrderNumber
	public int setOrderNum() {
		Random r = new Random();
		int Num = r.nextInt(100000 - 50000) + 50000;//Get order order number in the range 50,000-100,000
		return Num;
	}
	public void addOrderLine(int lineNum, int price, int quantity) {
		this.orderLines.add(new OrderLine(lineNum, price, quantity, this));
	}
	
	public List<OrderLine> getOrderLines(){
		return this.orderLines;
	}
	@Override
	public String toString() {
		return "Order [OrderNumber:"+this.orderNum+" OrderDate:"+this.orderDate+" OrderLine:"+Arrays.asList(orderLines);
	}
}
