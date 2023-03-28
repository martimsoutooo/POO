package aula06.exercicio2;

import java.util.Scanner;
public class TestContact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation;

        do {
            System.out.println("Contact operations");
            System.out.println("1 - insert new contact");
            System.out.println("2 - change contact");
            System.out.println("3 - delete contact");
            System.out.println("4 - search contact");
            System.out.println("5 - contact list");
            System.out.println("0 - exit");

            operation = sc.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("Insert the name: ");
                    String nome = sc.next();

                    System.out.println("Insert the email: ");
                    String email = sc.next();

                    System.out.println("Insert the phone number: ");
                    int ntelemovel = sc.nextInt();

                    System.out.println("Insert the cc number: ");
                    int cc = sc.nextInt();

                    System.out.println("Insert the day: ");
                    int day = sc.nextInt();

                    System.out.println("Insert the month: ");
                    int month = sc.nextInt();

                    System.out.println("Insert the year: ");
                    int year = sc.nextInt();

                    DateYMD dataNasc = new DateYMD(day, month, year);

                    Contacto contact = new Contacto(nome, cc, dataNasc, ntelemovel, email);
                    Contacto.contactList.add(contact);

                    break;
                    
                case 2:
                    System.out.print("Insert the name of contact you want to change: ");
                    nome = sc.next();

                    for (int i = 0; i < Contacto.contactList.size(); i++) {

                        if (Contacto.contactList.get(i).getPessoa().equals(nome)) {
                            System.out.println("Insert the new name: ");
                            nome = sc.next();

                            System.out.println("Insert the new email: ");
                            email = sc.next();

                            System.out.println("Insert the new phone number: ");
                            ntelemovel = sc.nextInt();

                            Contacto.contactList.get(i).setPessoa(nome);
                            Contacto.contactList.get(i).setEmail(email);
                            Contacto.contactList.get(i).setNumTel(ntelemovel);
                        }
                    }

                    break;
                case 3:
                    System.out.print("Insert the name of contact you want to delete:");
                    nome = sc.next();

                    for (int i = 0; i < Contacto.contactList.size(); i++) {

                        if (Contacto.contactList.get(i).getPessoa().equals(nome)) {
                            Contacto.contactList.remove(i);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Insert the name of contact you want to search: ");
                    nome = sc.next();

                    for (int i = 0; i < Contacto.contactList.size(); i++) {

                        if (Contacto.contactList.get(i).getPessoa().equals(nome)) {
                            System.out.println(Contacto.contactList.get(i));
                        }
                    }
                    break;

                case 5:
                    System.out.println("Contact list: ");
                    for (int i = 0; i < Contacto.contactList.size(); i++) {
                        System.out.println(Contacto.contactList.get(i));
                    }
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
            System.out.println();

        } while (operation != 0);

        sc.close();

    }        
}
