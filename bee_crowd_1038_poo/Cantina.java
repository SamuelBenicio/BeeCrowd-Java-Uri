package bee_crowd_1038_poo;

public class Cantina {
	private int codigo;
	private int quantidade;
	
	public Cantina(int codigo,int quantidade) {
		this.codigo = codigo;
		this.quantidade = quantidade;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo() {
		this.codigo = codigo;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade() {
		this.quantidade = quantidade;
	}
	
	public double calculaTotal() {
		if(codigo==1) {
			double total = 4*quantidade;
			return total;
		}
		if(codigo==2) {
			double total = 4.50*quantidade;
			return total;
		}
		if(codigo==3) {
			double total = 5*quantidade;
			return total;
		}
		if(codigo==4) {
			double total = 2*quantidade;
			return total;
		}
		else {
			double total = 1.5*quantidade;
			return total;
		}
	}
}
