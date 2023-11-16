package lista_04;

abstract public class AnimalAB implements AnimalIF{
    private int quantidadeDeComida = 0;
    private int quantidadePercorrida = 0;
    private int quantidadeDormida = 0;

    public AnimalAB(){
    }

    public int getQuantidadeDeComida() {
        return quantidadeDeComida;
    }

    public void setQuantidadeDeComida(int quantidadeDeComida) {
        this.quantidadeDeComida = quantidadeDeComida;
    }

    public int getQuantidadePercorrida() {
        return quantidadePercorrida;
    }

    public void setQuantidadePercorrida(int quantidadePercorrida) {
        this.quantidadePercorrida = quantidadePercorrida;
    }

    public int getQuantidadeDormida() {
        return quantidadeDormida;
    }

    public void setQuantidadeDormida(int quantidadeDormida) {
        this.quantidadeDormida = quantidadeDormida;
    }

    public void comer(int quantidadeDeComida){
        this.quantidadeDeComida += quantidadeDeComida;
    };
    public void mover(int quantidadeDePercorrida){
        this.quantidadePercorrida += quantidadePercorrida;
    };
    public void dormir(int quantidadeDormidan){
        this.quantidadeDormida += quantidadeDormida;
    };
}
