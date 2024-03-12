package bee_crowd_1009_poo;

public class Funcionario {
	private String name;
	private double salario;
	private double totalVendas;
	
	
	
	public Funcionario(String name, double salario, double totalVendas) {
		this.name = name;
		this.salario = salario;
		this.totalVendas = totalVendas;
	}


	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public double getTotalVendas() {
		return totalVendas;
	}


	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	
	
	public double calcularBonus() {
		double bonus = (totalVendas*0.15)+salario;
		return bonus;
	}
	
}
