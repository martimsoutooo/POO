package aula08.exercicio3;

public interface Compra { 
    void adicionarProduto (Produto produto, int quantidade); 
    void listarProdutos(); 
    double calcularTotal();
  }