package bee_crowd_2061_poo;

public class Navegador {
    private int nAbas;
    private int nAcoes;
    private String acao;

    public Navegador(int nAbas, int nAcoes) {
        this.nAbas = nAbas;
        this.nAcoes = nAcoes;
    }

    public int getnAbas() {
        return nAbas;
    }

    public int getnAcoes() {
        return nAcoes;
    }

    public void setnAbas(int nAbas) {
        this.nAbas = nAbas;
    }

    public void setnAcoes(int nAcoes) {
        this.nAcoes = nAcoes;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public int calculaAbas(int nAbas,String acao){
        if(nAbas>=0){
            if(acao.equals("fechou")){
                nAbas = (nAbas-1)+2;
                return nAbas;
            }
            else if(acao.equals("clicou")){
                nAbas -=1;
                return nAbas;
            }
            else {
                return nAbas;
            }
        }
        return nAbas;
    }
}