import java.util.Date;

public interface Facade {

    public abstract void criarProduto(String nome, String fabricante, double preco);

    public abstract void criarLote(int quantidade, Date dataValidade, Produto produto);

    public abstract String listarProdutos();

    public abstract String listarLotes();
}
