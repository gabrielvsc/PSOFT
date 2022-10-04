public class Produto {

    private final String nomeDoProduto;
    private final String fabricanteDoProduto;
    private final double precoDoProduto;

    public Produto(String nome, String fabricante, double preco) {
        this.nomeDoProduto = nome;
        this.fabricanteDoProduto = fabricante;
        this.precoDoProduto = preco;
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