package model;

public class Funcionario {
	
	private int id = (Integer) null;
    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	private String nome;
    private int idade;
	
    private int cpf;
    
    private String email;
    
    
    public Funcionario(String nome, int idade, int cpf, String email, int id) {
    	this.id =id;
    	this.nome = nome;
    	this.idade = idade;
    	this.cpf = cpf;
    	this.email = email;
    	
    	
    }


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

    
    
}
