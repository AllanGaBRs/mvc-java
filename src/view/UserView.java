package view;

import java.util.ArrayList;

import model.entities.Address;
import model.entities.User;

public class UserView {

	public void showUserDetails(String name, int age, String email, Address address, String cpf) {
		System.out.println("\nUsuário encontrado:");
		System.out.println("Nome do usuario: " + name);
		System.out.println("Idade do " + name + ": " + age);
		System.out.println("E-mail do " + name + ": " + email);
		System.out.println("Endereço do " + name + ": " + address.toString());
		System.out.println("CPF do " + name + ": " + cpf);
	}

	public void showMessage(String message) {
		System.out.println(message);
	}

	public void showUserList(ArrayList<User> users) {
		for (int i = 0; i < users.size(); i++) {
			System.out.println(i + 1 + " - " + users.get(i));
		}
	}
	
	public void showMenu() {
    	System.out.println("Escolha uma opção:");
		System.out.println("1 - Registrar");
		System.out.println("2 - Listar todos");
		System.out.println("3 - Buscar pelo CPF");
		System.out.println("4 - Buscar pelo Nome");
		System.out.println("5 - Sair");
    }
}
