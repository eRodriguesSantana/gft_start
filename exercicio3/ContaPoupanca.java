package exercicio3;

public class ContaPoupanca extends Conta {

	@Override
	public double rendimento() {
		return getSaldo() * 0.05;
	}
	
	public String toString() {
		return
			"Titular: " + this.getNome() + "\n" +
			"Numero Conta: " + this.getNumero() + "\n" +
			"Saldo Conta: R$" + this.getSaldo() + "\n" +
			"Rendimento Saldo: R$" + this.rendimento();
	}
}
