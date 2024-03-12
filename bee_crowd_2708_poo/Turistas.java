package bee_crowd_2708_poo;

public class Turistas {
	private String trafego;
	private int quantidade;
	private int contador;
	private int total;


	public Turistas(String trafego, int quantidade) {
		this.trafego = trafego;
		this.quantidade = quantidade;
	}


	public String getTrafego() {
		return trafego;
	}


	public void setTrafego(String trafego) {
		this.trafego = trafego;
	}


	public int getContador() {
		return contador;
	}


	public void setContador(int contador) {
		this.contador = contador;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
			
	public int calculaQuantidadeJeep(String trafego) {
		if(trafego.equals("SALIDA")) {
			contador +=1;
			return contador;
		}
		else if(trafego.equals("VUELTA")){
			contador -=1;
			return contador;
		}
		else {
			return contador;
		}
	}
	public int totalTuristas(int quantidade) {
		if(trafego.equals("SALIDA")) {
			total += quantidade;
		}
		else if(trafego.equals("VUELTA")){
			total -=quantidade;
		}
		return total;
	}
	
}
