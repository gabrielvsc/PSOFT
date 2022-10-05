import java.nio.file.FileAlreadyExistsException;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Services sv = new Services();
        ProdutoRepository pr = new ProdutoRepository();
        LoteRepository lr = new LoteRepository();

        sv.criarProduto(99,"Home Bike", "Monark", 1945.00);
        sv.criarLote(20,4, new Date("22-12-2002"), sv.getProduto(99, pr));
    }
}