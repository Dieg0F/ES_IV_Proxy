package br.edu.univas;

public class BancoAlunos {

	private int qtdUsuarios;
	private int usersConectados;

	public BancoAlunos() {
		qtdUsuarios = (int) (Math.random() * 100);
		usersConectados = (int) (Math.random() * 10);
	}

	public String getNumberUsers() {
		return new String("Total de alunos: " + qtdUsuarios);
	}

	public String getUsersConectados() {
		return new String("Usuários conectados: " + usersConectados);
	}
}
