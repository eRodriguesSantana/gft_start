package exercicio3;

public class ContaCorrente extends Conta implements Imposto{

	@Override
	public double rendimento() {
		return getSaldo() * 0.03;
	}
	
	public String toString() {
		return
			"Titular: " + this.getNome() + "\n" +
			"Numero Conta: " + this.getNumero() + "\n" +
			"Saldo Conta: R$" + this.getSaldo() + "\n" +
			"Rendimento Saldo: R$" + this.rendimento() + "\n" +
			"Imposto: R$" + this.calculaImposto();
	}

	@Override
	public double calculaImposto() {
		return this.rendimento() * 0.25;
	}
}
