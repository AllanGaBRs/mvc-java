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

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setName(String name) {
	    this.name = name;
	}


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email.trim();
    }

    public Address getAddress() {
        return address;
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
