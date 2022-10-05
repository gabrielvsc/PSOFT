import java.util.Date;

public class Services implements Facade {

    public Services() {
    }
    @Override
    public void criarProduto(int id, String nome, String fabricante, double preco) {
        Produto novoProduto = new Produto(id, nome, fabricante, preco);
    }

    @Override
    public void criarLote(int id, int quantidade, Date dataValidade, Produto produto) {
        Lote novoLote = new Lote(id, quantidade, dataValidade, produto);
    }

    @Override
    public String listarProdutos() {
        String listaProdutos = "";

        return listaProdutos;
    }

    @Override
    public String listarLotes() {
        String listaLotes = "";


        return listaLotes;
    }

    @Override
    public Produto getProduto(int id, ProdutoRepository repository) {
        return null;
    }

}
