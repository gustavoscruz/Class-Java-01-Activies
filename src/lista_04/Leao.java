package lista_04;

public class Leao extends AnimalAB{

    public Leao(){}
    @Override
    public void comer(){
        setQuantidadeDeComida(6);
    };
    @Override
    public void mover(){
        setQuantidadePercorrida(100);
    };

    @Override
    public void dormir(){
        setQuantidadeDormida(20);
    };
}
