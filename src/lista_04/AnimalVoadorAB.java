package lista_04;

abstract public class AnimalVoadorAB extends AnimalAB {
    int voo = 0;
    public AnimalVoadorAB(){}

    public int getVoo() {
        return voo;
    }

    public void setVoo(int voo) {
        this.voo = voo;
    }

    public void voar(){
        voo++;
    }
}
