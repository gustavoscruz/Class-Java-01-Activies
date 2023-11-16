package lista_04;

abstract public class AnimalMarinhoAB extends AnimalAB{
    private int nadar = 0;
    private int quantidadeDeAsas;
    private float envergaduraDaAsa;
    public AnimalMarinhoAB(){}

    public int getNadar() {
        return nadar;
    }

    public void setNadar(int nadar) {
        this.nadar = nadar;
    }

    public int getQuantidadeDeAsas() {
        return quantidadeDeAsas;
    }

    public void setQuantidadeDeAsas(int quantidadeDeAsas) {
        this.quantidadeDeAsas = quantidadeDeAsas;
    }

    public float getEnvergaduraDaAsa() {
        return envergaduraDaAsa;
    }

    public void setEnvergaduraDaAsa(float envergaduraDaAsa) {
        this.envergaduraDaAsa = envergaduraDaAsa;
    }

    public void nadar(){
        nadar++;
    }
}
