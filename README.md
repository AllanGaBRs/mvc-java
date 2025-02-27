# Java Console User Registration (MVC)

## Descrição
Este é um projeto simples de aplicação de console em Java que permite o registro e consulta de usuários. Os dados são armazenados apenas em tempo de execução, ou seja, ao encerrar a aplicação, todas as informações são perdidas.

A aplicação segue o padrão de arquitetura MVC (Model-View-Controller).

## Estrutura do Projeto
```
- src/
  - application/
    -Program.java
  - controller/
    - UserController.java
  - model/
    -entities/
      - User.java
      - Address.java
  - view/
    - UserView.java
```

## Funcionalidades
### **UserController** (Camada de Controle)
- `addUser(String name, int age, String email, String street, Integer number, String cpf)`: Adiciona um usuário ao sistema, verificando se o CPF já está cadastrado.
- `searchUserByName(String name)`: Procura um usuário pelo nome e exibe o primeiro resultado encontrado.
- `searchUserByCpf(String cpf)`: Exibe o usuário que possui o CPF informado, caso esteja registrado.
- `listAll()`: Lista todos os usuários cadastrados.

### **Model** (Camada de Modelo)
- **User**: Representa um usuário, contendo atributos como nome, idade, email, CPF e um objeto `Address`.
- **Address**: Representa um endereço, associado ao usuário.

### **UserView** (Camada de Visão)
Responsável por exibir informações ao usuário no console.

## Observação
- Os dados não são persistidos. Ao fechar o programa, todos os registros são perdidos.
- O CPF é utilizado como identificador único para evitar cadastros duplicados.

---
Projeto desenvolvido para fins de aprendizado sobre Java e padrão MVC.

