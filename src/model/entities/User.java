package model.entities;

public class User {

	private String name;
	private int age;
	private String email;
	private Address address;
	private String cpf;

	public User() {

	}

	public User(String name, int age, String email, String street, Integer number, String cpf) {
		this.name = name.trim();
		this.age = age;
		this.email = email.trim();
		this.address = new Address(street, number);
		this.cpf = cpf.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("Nome não pode ser vazio");
		}
		if (name.trim().length() < 3) {
			throw new IllegalArgumentException("Nome deve conter no min 3 caracteres");
		}
		this.name = name.trim();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age <= 0 || age > 120) {
			throw new IllegalArgumentException("Idade inválida");
		}
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email == null || email.isBlank()) {
			throw new IllegalArgumentException("Email nao pode ser vazio");
		}

		String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

		if (!email.matches(emailRegex)) {
			throw new IllegalArgumentException("Email inválido");
		}

		this.email = email.trim();
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf.trim();
	}

	@Override
	public String toString() {
		return name;
	}

}
