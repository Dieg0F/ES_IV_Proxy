package br.edu.univas;

public class Proxy extends BancoAlunos{
	
	protected String user, pass;
	
	public Proxy(String user, String pass) {
		this.user = user;
		this.pass = pass;
	}
	
	@Override
	public String getNumberUsers() {
		if(isPermitted()) {
		return super.getNumberUsers();	
		}
		return null;
	}
	
	@Override
    public String getUsersConectados() {
        if (isPermitted()) {
            return super.getUsersConectados();
        }
        return null;
    }
	
	private boolean isPermitted() {
		return user == "admin" && pass == "admin";
	}
}