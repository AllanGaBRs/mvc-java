package application;

import java.util.Scanner;

import controller.UserController;
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

				User user = view.userRegister(sc);
				controller.addUser(user.getName(), user.getAge(), user.getEmail(), user.getAddress().getStreet(), user.getAddress().getNumber(), user.getCpf());

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
