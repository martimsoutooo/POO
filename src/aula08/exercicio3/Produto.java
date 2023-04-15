package aula08.exercicio3;

public interface Produto { 
    String getNome(); 
    double getPreco(); 
    int getQuantidade(); 
    void adicionarQuantidade(int quantidade); 
    void removerQuantidade(int quantidade); 
  }
