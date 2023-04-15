package aula08.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras implements Compra {
    
    private List<Produto> produtos;
    
    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    @Override
    public void adicionarProduto(Produto produto, int quantidade) {
        if (produtos.contains(produto)) {
            int index = produtos.indexOf(produto);
            Produto produtoExistente = produtos.get(index);
            produtoExistente.adicionarQuantidade(quantidade);
        } else {
            produto.adicionarQuantidade(quantidade);
            produtos.add(produto);
        }
    }

    @Override
    public void listarProdutos() {
        System.out.println("Produtos no carrinho:");
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " - " + produto.getQuantidade() + " unidades");
        }
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco() * produto.getQuantidade();
        }
        return total;
    }
}




