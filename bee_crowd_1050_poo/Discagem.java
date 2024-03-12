package bee_crowd_1050_poo;

public class Discagem {
	private int ddd;
	private String regiao;
	
	


	
	
	public Discagem(int ddd ) {
		this.ddd = ddd;
	}



	public int getDdd() {
		return ddd;
	}


	public void setDdd(int ddd) {
		this.ddd = ddd;
	}



	public String getRegiao() {
		return regiao;
	}


	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}




	public void regiao(int ddd) {
		if(ddd==11) {
			System.out.println("Sao Paulo");
		}
		else if(ddd==19) {
			System.out.println("Campinas");
		}
		else if(ddd==21) {
			System.out.println("Rio de Janeiro");
		}
		else if(ddd==27) {
			System.out.println("Vitoria");
		}
		else if(ddd==31) {
			System.out.println("Belo Horizonte");
		}
		else if(ddd==32) {
			System.out.println("Juiz de Fora");
		}
		else if(ddd==61) {
			System.out.println("Brasilia");
		}
		else if(ddd==71) {
			System.out.println("Salvador");
		}
		else {
			System.out.println("DDD nao cadastrado");
		}
	}
}
