package lista_04;

abstract public class AnimalAB implements AnimalIF{
    private int quantidadeDeComida = 0;
    private int quantidadePercorrida = 0;
    private int quantidadeDormida = 0;

    private String nome;
    private String tipo;
    private int idade;
    private String habitat;
    private int quantidadeDePatas;

    private double altura;
    private double peso;

    public AnimalAB() {
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

    public void comer(){
        quantidadeDeComida ++;
    };

    public void mover(){
        quantidadePercorrida ++;
    };

    public void dormir(){
        quantidadeDormida++;
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getQuantidadeDePatas() {
        return quantidadeDePatas;
    }

    public void setQuantidadeDePatas(int quantidadeDePatas) {
        this.quantidadeDePatas = quantidadeDePatas;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
