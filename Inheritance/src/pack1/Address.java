package pack1;

public class Address {

	private String strretName;
	private String houseNo;
	private String city;
	private String state;

	public Address(String strretName, String houseNo, String city, String state) {
		this.strretName = strretName;
		this.houseNo = houseNo;
		this.city = city;
		this.state = state;
	}

	public String getStrretName() {
		return strretName;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

}
