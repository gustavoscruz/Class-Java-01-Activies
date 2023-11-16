package lista_04;

public class Elefante extends AnimalAB{
    public Elefante(){}
    @Override
    public void comer(){
        setQuantidadeDeComida(200);
    };
    @Override
    public void mover(){
        setQuantidadePercorrida(60);
    };

    @Override
    public void dormir(){
        setQuantidadeDormida(48);
    };
}
