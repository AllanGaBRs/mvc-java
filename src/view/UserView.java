package view;

import model.entities.Address;

public class UserView {
	
	public void showUserDetails(String name, int age, String email, Address address, String cpf) {
        System.out.println("\nUsuário encontrado:");
        System.out.println("Nome do usuario: " + name);
        System.out.println("Idade do " + name + ": " + age);
        System.out.println("E-mail do " + name + ": " + email);
        System.out.println("Endereço do " + name + ": " + address.toString());
        System.out.println("CPF do " + name + ": " + cpf);
    }
	
}
