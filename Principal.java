public class Principal {

    public static void main(String[] args) {
        Carro carros; 
        Moto motos;

        carros = new Carro("Toyota", "Corolla", 2020, "preto", 4);
        motos = new Moto("Honda", "CBR500R", 2021, "Vermelho", 500);
		
        System.out.println("Informações do Carro:");
        System.out.println(carros.descricao());
        
        System.out.println("\nInformações da Moto:");
        System.out.println(motos.descricao());
    }

}
