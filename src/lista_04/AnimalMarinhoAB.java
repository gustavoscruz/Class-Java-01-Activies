package lista_04;

abstract public class AnimalMarinhoAB extends AnimalAB{
    int nadar = 0;
    public AnimalMarinhoAB(){}

    public int getNadar() {
        return nadar;
    }

    public void setNadar(int nadar) {
        this.nadar = nadar;
    }

    public void nadar(){
        nadar++;
    }
}
