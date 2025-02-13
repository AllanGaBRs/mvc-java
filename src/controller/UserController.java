package controller;

import java.util.ArrayList;

import model.entities.Address;
import model.entities.User;
import view.UserView;

public class UserController {

	private ArrayList<User> users;
	private UserView view;

	public UserController(UserView view) {
		this.users = new ArrayList<>();
		this.view = view;
	}

	public void addUser(String name, int age, String email, String street, Integer number, String cpf) {
		for (User user : users) {
			if (user.getCpf().equals(cpf)) {
				view.showMessage("Erro: O CPF '" + cpf + "' já está cadastrado.");
				return;
			}
		}

		try {
			Address newAddress = new Address();
			newAddress.setStreet(street);
			newAddress.setNumber(number);
			User newUser = new User();
			newUser.setName(name);
			newUser.setAge(age);
			newUser.setCpf(cpf);
			newUser.setAddress(newAddress);
			newUser.setEmail(email);
			users.add(newUser);
			view.showMessage("Usuário " + newUser.getName() + " cadastrado com sucesso!");
		} catch (IllegalArgumentException e) {
			view.showMessage("Erro ao adicionar usuário: " + e.getMessage());
		}
	}
	
	  public void searchUserByName(String name) {
	        for (User user : users) {
	            if (user.getName().equals(name)) {
	                view.showUserDetails(user.getName(), user.getAge(), user.getEmail(), user.getAddress(), user.getCpf());
	                return;
	            }
	        }
	        view.showMessage("Usuário não encontrado.");
	    }
}
