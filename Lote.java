import java.util.Date;

public class Lote {
    private final int quantidadeDeLotes;
    private final Date dataValidadeLote;
    private final Produto produtoDoLote;

    public Lote(int quantidade, Date dataValidade, Produto produto) {
        this.quantidadeDeLotes = quantidade;
        this.dataValidadeLote = dataValidade;
        this.produtoDoLote = produto;
    }

    public int getQuantidadeDeLotes() {
        return quantidadeDeLotes;
    }

    public Date getDataValidadeLote() {
        return dataValidadeLote;
    }

    public Produto getProdutoDoLote() {
        return produtoDoLote;
    }
}