package lista_04;

public class Pombo extends AnimalVoadorAB{
    public Pombo(){}
    @Override
    public void comer(){
        setQuantidadeDeComida(1);
    };
    @Override
    public void voar(){
        setQuantidadePercorrida(500);
    };

    @Override
    public void dormir(){
        setQuantidadeDormida(8);
    };


}
