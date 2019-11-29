package pack1;

public class Orders {

	private long orderId;

	private int noofitems;

	private String foodName;

	private String restarentName;

	private double price;

	private int discount;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public int getNoofitems() {
		return noofitems;
	}

	public void setNoofitems(int noofitems) {
		this.noofitems = noofitems;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getRestarentName() {
		return restarentName;
	}

	public void setRestarentName(String restarentName) {
		this.restarentName = restarentName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", noofitems=" + noofitems + ", foodName=" + foodName + ", restarentName="
				+ restarentName + ", price=" + price + ", discount=" + discount + "]";
	}

}
