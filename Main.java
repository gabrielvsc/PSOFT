public class Main {

    public static void main(String[] args) {
        Produto bicicleta = new Produto("Home Bike","Monark",1945.00);
        Lote loteBicicleta = new Lote(4, new Date(2025, 12, 12), bicicleta);
    }
}