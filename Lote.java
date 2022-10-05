import java.util.Date;

public class Lote {

    private final int idLote;
    private final int quantidadeDeProdutos;
    private final Date dataValidadeLote;
    private final Produto produtoDoLote;

    public Lote(int id, int quantidade, Date dataValidade, Produto produto) {
        this.idLote = id;
        this.quantidadeDeProdutos = quantidade;
        this.dataValidadeLote = dataValidade;
        this.produtoDoLote = produto;
    }

    public int getIdLote() {
        return idLote;
    }
    public int getQuantidadeDeLotes() {
        return quantidadeDeProdutos;
    }

    public Date getDataValidadeLote() {
        return dataValidadeLote;
    }

    public Produto getProdutoDoLote() {
        return produtoDoLote;
    }
}