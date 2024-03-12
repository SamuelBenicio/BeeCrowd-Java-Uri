package bee_crowd_1073_poo;

public class CalculoQuadrado {
	private int numero;
	
	public CalculoQuadrado(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void calculaPar2(int numero) {
		//int i=0;
		for(int i=1;i<=numero;i+=1) {
			if(i%2==0) {
				int elevado = i*i;
				System.out.printf("%d^2 = %d%n",i,elevado);
			}
		}
	}
}
