package exercicio3;

public class Principal {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.setNome("Eduardo");
		cc.setNumero("123-4");
		cc.setSaldo(1.500);
		cc.rendimento();
		System.out.println(cc.toString());
		
		System.out.println();
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setNome("Nilza");
		cp.setNumero("567-8");
		cp.setSaldo(10.500);
		cp.rendimento();
		System.out.println(cp.toString());

	}

}
