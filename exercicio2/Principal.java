package exercicio2;

public class Principal {
	
	/*	Crie uma Classe Pessoa, contendo os atributos (nome, endereço e telefone)
		encapsulados, com seus respectivos seletores (getters) e modificadores (setters), e ainda o
		construtor padrão. Por fim, criar uma classe principal que instancie o objeto Pessoa,
		adicione no mínimo um valor para cada atributo e imprima na tela.
	*/

	public static void main(String[] args) {

		Endereco endereco = new Endereco();
		endereco.setNome_rua("Estrada das Nações");
		endereco.setNumero(395);
		endereco.setCep("06422-100");
		endereco.setBairro("Vl. Iracema");
		endereco.setCidade("Barueri");
		endereco.setUf("SP");
		endereco.setComplemento("Sem complemento");
		
		Telefone telefone = new Telefone();
		telefone.setCelular("(11)95555-4444");
		telefone.setFixo("(11)3333-4444");
		telefone.setRecado("(11)5555-6666");		
		
		Pessoa pessoa = new Pessoa("Eduardo R. Santana", endereco, telefone);
		
		System.out.println(pessoa.toString());	
		
	}

}
