package exercicio2;

public class Pessoa {
	
	private String nome;
	private Endereco endereco;
	private Telefone telefone;
	
	public Pessoa(String nome, Endereco endereco, Telefone telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Telefone getTelefone() {
		return telefone;
	}
	
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	public String toString() {
		return 
			"Nome: " + this.nome + "\n" +
			"Endereço:" + "\n" +
			"\tRua: " + this.endereco.getNome_rua() + "\n" +
			"\tNúmero: " + this.endereco.getNumero() + "\n" +
			"\tCEP: " + this.endereco.getCep() + "\n" +
			"\tBairo: " + this.endereco.getBairro() + "\n" +
			"\tCidade: " + this.endereco.getCidade() + "\n" +
			"\tUF: " + this.endereco.getUf() + "\n" +
			"\tComplemento: " + this.endereco.getComplemento() + "\n" +
			"Telefone(s):" + "\n" +
			"\tCelular: " + this.telefone.getCelular() + "\n" +
			"\tFixo: " + this.telefone.getFixo() + "\n" +
			"\tRecado: " + this.telefone.getRecado();
	}
	
}
