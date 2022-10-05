import java.util.Date;

public interface Facade {

    public abstract void criarProduto(int id, String nome, String fabricante, double preco);

    public abstract void criarLote(int id, int quantidade, Date dataValidade, Produto produto);

    public abstract String listarProdutos();

    public abstract String listarLotes();

    public abstract Produto getProduto(int id, ProdutoRepository repository);
}
