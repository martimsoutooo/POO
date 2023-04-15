package aula08.exercicio3;

public class ProdutoComDesconto extends ProdutoGenerico {
    
    private int desconto;
    
    public ProdutoComDesconto(String nome, double preco, int quantidade, int desconto) {
        super(nome, preco, quantidade);
        this.desconto = desconto;
    }
    
    @Override
    public double getPreco() {
        return super.getPreco() * (1 - desconto / 100.0);
    }

}
