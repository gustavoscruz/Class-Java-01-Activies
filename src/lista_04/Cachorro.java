package lista_04;

public class Cachorro extends AnimalAB {

    public Cachorro(){}
    @Override
    public void comer(){
        setQuantidadeDeComida(2);
    };
    @Override
    public void mover(){
        setQuantidadePercorrida(10);
    };

    @Override
    public void dormir(){
        setQuantidadeDormida(14);
    };

}
