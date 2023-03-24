package aula04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exercicio4 {

    static Scanner sc = new Scanner(System.in);

    static int registerCars(Car[] cars) {

        int numCars = 0;

        while (true) {
            System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");
            String entrada = sc.nextLine();

            if (entrada.trim().isEmpty()) {
                break;
            }

            if (!verificaEntrada(entrada)) {
                System.out.println("Dados mal formatados, tente novamente.");
                continue;
            }

            String[] informacoes = entrada.split(" ");
            String marca = informacoes[0];
            String modelo = informacoes[1];
            int ano = Integer.parseInt(informacoes[2]);
            int quilometragem = Integer.parseInt(informacoes[3]);

            Car car = new Car(marca, modelo, ano, quilometragem);
            cars[numCars] = car;
            numCars++;

            if (numCars == 10) {
                System.out.println("O limite de carros foi atingido.");
                break;
            }
        }
        return numCars;
    }

    static void registerTrips(Car[] cars, int numCars) {

        while (true) {
            System.out.print("Registe uma viagem no formato \"carro:distância\": ");
            String entrada1 = sc.nextLine();

            if (entrada1.trim().isEmpty()) {
                break;
            }
            if (!verificaFormatoViagem(entrada1)) {
                System.out.println("Dados mal formatados, tente novamente.");
                continue;
            }

            String[] infoViagem = entrada1.split(":");
            int carro = Integer.parseInt(infoViagem[0]);
            int kms = Integer.parseInt(infoViagem[1]);

            if (carro >= numCars) {
                System.out.println("Carro inexistente, tente novamente.");
                continue;
            }

            cars[carro].drive(kms);
            System.out.println("Viagem registada.");
        }

    }

    static void listCars(Car[] cars) {
        System.out.println("\nCarros registados: ");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                System.out.println(cars[i].toString());
            }
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        Car[] cars = new Car[10];

        int numCars = registerCars(cars);

        if (numCars > 0) {
            listCars(cars);
            registerTrips(cars, numCars);
            listCars(cars);
        }

        sc.close();

    }

    public static boolean verificaFormatoViagem(String entrada) {
        if (entrada.matches("^[^:]+:\\d+(\\.\\d+)?$")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean verificaEntrada(String entrada) {
        Pattern padraoEntrada = Pattern.compile("[a-zA-Z]+\\s[a-zA-Z]+\\s\\d{4}\\s\\d+");
        Matcher matcher = padraoEntrada.matcher(entrada);
        if (matcher.matches()) {
            return true;
        } else {
            System.out.println("A entrada deve estar no formato: marca modelo ano quilometragem.");
            return false;
        }
    }
}