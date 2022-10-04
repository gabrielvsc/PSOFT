import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Produto bicicleta = new Produto("Home Bike","Monark",1945.00);
        Lote loteBicicleta = new Lote(4, new Date(2025, Calendar.JANUARY, 12), bicicleta);

        System.out.println(bicicleta.getNomeDoProduto());
        System.out.println(bicicleta.getFabricanteDoProduto());
        System.out.println(bicicleta.getPrecoDoProduto());

        System.out.println(loteBicicleta.getQuantidadeDeLotes());
        System.out.println(loteBicicleta.getDataValidadeLote());
        System.out.println(loteBicicleta.getProdutoDoLote());
    }
}