package lista_04;

public class Peixe extends AnimalMarinhoAB{
    public Peixe(){}
    @Override
    public void comer(){
        setQuantidadeDeComida(1);
    };
    @Override
    public void nadar(){
        setQuantidadePercorrida(25);
    };

    @Override
    public void dormir(){
        setQuantidadeDormida(8);
    };
}
