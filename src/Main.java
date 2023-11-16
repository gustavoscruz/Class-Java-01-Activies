import lista_04.*;

public class Main {
    public static void main(String[] args){
        Peixe chowchow = new Peixe();
        chowchow.dormir();
        chowchow.comer();
        chowchow.nadar();
        System.out.println(chowchow.getQuantidadeDormida());
        System.out.println(chowchow.getQuantidadeDeComida());
        System.out.println(chowchow.getQuantidadePercorrida());

    }
}
