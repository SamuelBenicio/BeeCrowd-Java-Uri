package bee_crowd_2286_poo;

public class Partida {
    private int nPartidas;
    private int numJogador1;
    private int numJogador2;
    private String nomeJogador1;
    private String nomeJogador2;
    private String vencedor;

    public Partida(String nomeJogador1,String nomeJogador2,int numJogador1, int numJogador2) {
        this.nomeJogador1 = nomeJogador1;
        this.nomeJogador2 = nomeJogador2;
        this.numJogador1 = numJogador1;
        this.numJogador2 = numJogador2;
    }

    public int getnPartidas() {
        return nPartidas;
    }

    public void setnPartidas(int nPartidas) {
        this.nPartidas = nPartidas;
    }

    public int getNumJogador1() {
        return numJogador1;
    }

    public void setNumJogador1(int numJogador1) {
        this.numJogador1 = numJogador1;
    }

    public int getNumJogador2() {
        return numJogador2;
    }

    public void setNumJogador2(int numJogador2) {
        this.numJogador2 = numJogador2;
    }

    public String getNomeJogador1() {
        return nomeJogador1;
    }

    public void setNomeJogador1(String nomeJogador1) {
        this.nomeJogador1 = nomeJogador1;
    }

    public String getNomeJogador2() {
        return nomeJogador2;
    }

    public void setNomeJogador2(String nomeJogador2) {
        this.nomeJogador2 = nomeJogador2;
    }

    public String getVencedor() {
        return vencedor;
    }

    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }


    public String calculaVencedor(int numJogador1,int numJogador2){
       if((numJogador1+numJogador2)%2==0){
           vencedor = nomeJogador1;
           return vencedor;
       }
       else{
           vencedor = nomeJogador2;
           return vencedor;
       }

    }
}