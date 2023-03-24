package aula06.exercicio2;

import java.util.Scanner;
import java.util.ArrayList;

public class TestContact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        int escolha = sc.nextInt();

        do {
            System.out.println("1. Inserir contacto");
            System.out.println("2. Alterar contacto");
            System.out.println("3. Apagar contacto");
            System.out.println("4. Procurar contacto");
            System.out.println("5. Listar contactos");
            System.out.println("0. Sair");
            System.out.print("Insira a sua escolha- ");

            escolha = sc.nextInt();

            switch(escolha){
                case 1:
                    System.out.print("Insira um número de telemóvel (ex: 923423120)- "); 
                    int numTel = sc.nextInt();

                    System.out.println("Insira um email (ex: utilizador@dominio.pt)");
                    String email = sc.nextLine();
                   
                case 2:
                    

                case 3:
                    
                case 4:
                    
                case 5:

            } 
        }while (escolha != 0);



        ArrayList<Object> contactos = new ArrayList<Object>();

        public Void addContacto(Contacto contacto) {
            if (contactos.contains(contacto)){
                System.out.println("Contacto já existe!");
            }
            contactos.add(contacto);
            System.out.println("Contacto adicionado com sucesso!");
            
        }

        
    }
}
