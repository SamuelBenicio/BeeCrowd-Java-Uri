package bee_crowd_2221_poo;

public class Pokemon {
    private String nome;
    private int repeticoes;
    private int bonus;
    private int ataque;
    private int defesa;
    private int level;


    public Pokemon(int ataque,int defesa,int level) {
        this.ataque = ataque;
        this.defesa = defesa;
        this.level = level;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double valorGolpe(int bonus){
        if(level%2==0){
            double golpe = ((ataque+defesa)/2)+bonus;
            return golpe;

        }
        else{
            double golpe = (ataque+defesa)/2;
            return golpe;
        }
    }


	
}
