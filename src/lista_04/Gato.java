package lista_04;

public class Gato extends AnimalAB{

    public Gato(){}
    @Override
    public void comer(){
        setQuantidadeDeComida(1);
    };
    @Override
    public void mover(){
        setQuantidadePercorrida(15);
    };

    @Override
    public void dormir(){
        setQuantidadeDormida(16);
    };
}
