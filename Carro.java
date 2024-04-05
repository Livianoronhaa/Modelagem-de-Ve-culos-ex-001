class Carro {
    public String marca;
    public String modelo;
    public int ano;
    public String cor;
    public int numero_portas;

    public Carro() {}

    //Construtor 
    public Carro(String marca, String modelo, int ano, String cor, int numero_portas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.numero_portas = numero_portas;
    }

    public String descricao() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Cor: " + cor + ", Numero de portas: " + numero_portas;
    }
}
