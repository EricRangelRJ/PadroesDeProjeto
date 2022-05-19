package model;

public class Client {

	private String name;
	private String address;
	private String phone;
	private String weight;
	private String height;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public Client(String name, String address, String phone, String weight, String height) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.weight = weight;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Dados do Cliente:"
				+ " \n Name= " + name +
				"\n Address= " + address + ""
				+ " \n Phone= " + phone + ""
				+ " \n Weight= "+ weight + "\n "
				+ "Height= " + height + "";
	}

}
