package bee_crowd_2434_poo;

public class Saldo {
	private int dias;
	private int saldo;
	private int valor;
	
	
	public Saldo(int saldo) {
		this.saldo = saldo;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public int getDias() {
		return dias;
	}


	public void setDias(int dias) {
		this.dias = dias;
	}


	public int getSaldo() {
		return saldo;
	}


	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public int calculaSaldo(int valor) {
			saldo = saldo+valor;
			return saldo;
	
	}
}
