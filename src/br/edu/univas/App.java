package br.edu.univas;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Pessoa sem permissão acessando");
		BancoAlunos banco = new Proxy("Outro", "1234");
		System.out.println(banco.getNumberUsers());
		System.out.println(banco.getUsersConectados());
		
		System.out.println("\n");
		
		System.out.println("Administrador acessando");
		banco = new Proxy("admin", "admin");
		System.out.println(banco.getNumberUsers());
		System.out.println(banco.getUsersConectados());	
	}
}