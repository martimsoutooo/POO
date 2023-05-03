package aula10.exercicio3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class exercicio3 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> lista = new ArrayList<>();
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Remover livro");
            System.out.println("3 - Listar livros");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Ano: ");
                    int ano = sc.nextInt();
                    sc.nextLine();
                    lista.add(new Book(titulo, autor, ano));
                    break;
                case 2:
                    System.out.print("Título: ");
                    String tituloRemover = sc.nextLine();
                    for (Book b : lista) {
                        if (b.getTitle().equals(tituloRemover)) {
                            lista.remove(b);
                            break;
                        }
                    }
                    break;
                case 3:
                    for (Book b : lista) {
                        System.out.println(b);
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        sc.close();
    }
}
