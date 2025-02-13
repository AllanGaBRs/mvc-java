package application;

import java.util.Scanner;

import controller.UserController;
import model.entities.Address;
import model.entities.User;
import view.UserView;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		UserView view = new UserView();
		UserController controller = new UserController(view);
		boolean status = true;

		while (status) {
			try {
			
			view.showMenu();

			int opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:

				System.out.println("Nome do usuario:");
				String name = sc.nextLine();
				User test = new User();
				test.setName(name);
				System.out.println("Idade do " + name);
				Integer age = sc.nextInt();
				test.setAge(age);
				sc.nextLine();
				System.out.println("Email do " + name);
				String email = sc.nextLine();
				test.setEmail(email);
				System.out.println("CPF do " + name + " (apenas número)");
				String cpf = sc.nextLine();
				test.setCpf(cpf);
				System.out.println("Rua do " + name);
				String street = sc.nextLine();
				System.out.println("Numero da casa do " + name);
				Integer number = sc.nextInt();
				Address addressTest = new Address(street, number);
				test.setAddress(addressTest);
				controller.addUser(name, age, email, street, number, cpf);

				break;
			case 2:
				controller.listAll();
				break;
			case 3:
				System.out.println("Qual cpf para busca: ");
				String cpfSearch = sc.nextLine();
				controller.searchUserByCpf(cpfSearch);
				break;
			case 4:
				System.out.println("Qual nome para busca: ");
				String nameSearch = sc.nextLine();
				controller.searchUserByName(nameSearch);
				break;
			case 5:
				status = false;
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
			}catch(IllegalArgumentException err) {
				view.showMessage(err.getMessage());
			}
		}

		sc.close();

	}

}
