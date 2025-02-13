package model.entities;

public class Address {

	private String street;
	private Integer number;

	public Address() {

	}

	public Address(String street, Integer number) {
		this.street = street.trim();
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		if (street == null || street.isBlank()) {
			throw new IllegalArgumentException("O campo 'Rua' não pode ser vazio");
		}
		this.street = street.trim();
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "\nRua: " + street + "\nNumero: " + number + "";
	}
}
