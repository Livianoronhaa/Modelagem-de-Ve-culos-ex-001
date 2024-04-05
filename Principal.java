public class Principal {

    public static void main(String[] args) {
    
        Carro carros = new Carro("Toyota", "Corolla", 2020, "preto", 4);
        Carro carro2 = new Carro("Fiat", "Palio", 2015, "Branco", 4);
        Carro carro3 = new Carro("Fiat", "Uno", 2009, "Vermelho", 2);
        
        Moto motos = new Moto("Honda", "CBR500R", 2021, "Vermelho", 500);
        Moto moto2 = new Moto("Yamarra", "LALALA", 2017, "Preto", 500);
        Moto moto3 = new Moto("Honda", "Fan", 2023, "Branco", 500);
		
        System.out.println("Informações dos carros:");
        System.out.println(carros.descricao());
        System.out.println(carro2.descricao());
        System.out.println(carro3.descricao());
        
        System.out.println("\nInformações das motos:");
        System.out.println(motos.descricao());
        System.out.println(moto2.descricao());
        System.out.println(moto3.descricao());
    }

}
