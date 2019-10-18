package lab2.qn2.prob2B;

public class OrderLine {
	private int lineNum;
	private int price;
	private int quantity;
	private Order order;
	
	OrderLine(int lineNum,int price, int quantity, Order order){
		this.lineNum = lineNum;
		this.price = price;
		this.quantity = quantity;
		this.order = order;
	}

	public int getLineNum() {
		return lineNum;
	}

	public void setLineNum(int lineNum) {
		this.lineNum = lineNum;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return lineNum+ " "+ price+ " "+quantity;
	}
}
