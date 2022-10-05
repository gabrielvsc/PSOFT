public class Produto {

    private final int idProduto;
    private final String nomeDoProduto;
    private final String fabricanteDoProduto;
    private final double precoDoProduto;

    public Produto(int id, String nome, String fabricante, double preco) {
        this.idProduto = id;
        this.nomeDoProduto = nome;
        this.fabricanteDoProduto = fabricante;
        this.precoDoProduto = preco;
    }

    public int getIdProduto() {
        return idProduto;
    }
    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public String getFabricanteDoProduto() {
        return fabricanteDoProduto;
    }

    public double getPrecoDoProduto() {
        return precoDoProduto;
    }
}