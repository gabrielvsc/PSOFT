import java.util.Date;

public class Services implements Facade {

    @Override
    public void criarProduto(String nome, String fabricante, double preco) {
        Produto novoProduto = new Produto(nome, fabricante, preco);
    }

    @Override
    public void criarLote(int quantidade, Date dataValidade, Produto produto) {
        Lote novoLote = new Lote(quantidade, dataValidade, produto);
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
}
