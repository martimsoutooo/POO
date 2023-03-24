package aula06.exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private ArrayList<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public void inserirContacto(Contacto contacto) {
        contactos.add(contacto);
        System.out.println("Contacto inserido com sucesso.");
    }

    public void alterarContacto(int id) {
        Contacto contacto = procurarContactoPorId(id);
        if (contacto != null) {
            System.out.println(contacto);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Novo telefone: ");
            String telefone = scanner.nextLine();
            if (!telefone.isBlank() && !telefone.matches("^9\\d{8}$")) {
                System.out.println("Telefone inválido.");
                return;
            }
            System.out.print("Novo email: ");
            String email = scanner.nextLine();
            if (!email.isBlank() && !email.matches("^\\S+@\\S+\\.(pt|com|net)$")) {
                System.out.println("Email inválido.");
                return;
            }
            contacto.telefone = telefone;
            contacto.email = email;
            System.out.println("Contacto alterado com sucesso.");
        }
    }

    public void apagarContacto(int id) {
        Contacto contacto = procurarContactoPorId(id);
        if (contacto != null) {
            contactos.remove(contacto);
            System.out.println("Contacto apagado com sucesso.");
        }
    }

    public Contacto procurarContactoPorId(int id) {
        for (Contacto contacto : contactos) {
            if (contacto.getId() == id) {
                return contacto;
            }
        }
        System.out.println("Contacto não encontrado.");
        return null;
    }
}
