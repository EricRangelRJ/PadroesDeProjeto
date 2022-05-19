package builder;

import model.Client;

public class ClientBuilder {

	// Obrigatório
	private String name;

	// Opcional
	private String address;
	private String phone;
	private String weight;
	private String height;

	public ClientBuilder(String name) {
		this.name = name;
	}

	public ClientBuilder andPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public ClientBuilder andWheight(String weight) {
		this.weight = weight;
		return this;
	}

	public ClientBuilder andHeight(String height) {
		this.height = height;
		return this;
	}

	public ClientBuilder andAddress(String address) {
		this.address = address;
		return this;
	}

	// Retornando o objeto completo
	public Client finish() {
		return new Client(name, address, phone, weight, weight);
	}

}
