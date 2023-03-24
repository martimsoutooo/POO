package aula03;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month, year, startDay;
        do {
            System.out.print("Insira o mês (1-12): ");
            month = sc.nextInt();
        } while (month < 1 || month > 12);

        do {
            System.out.print("Insira o ano (yyyy): ");
            year = sc.nextInt();
        } while (year < 1);

        do {
            System.out.print("Insira o dia da semana em que o mês começa (1-7): ");
            startDay = sc.nextInt();
        } while (startDay < 1 || startDay > 7);

        printCalendar(month, year, startDay);

        sc.close();
    }

    public static int daysInMonth(int month, int year) {
        int days = 0;
        switch (month) {
            case 2:
                days = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
                break;
        }
        return days;
    }

    public static void printCalendar(int month, int year, int startDay) {
        String[] weekDays = { "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa" };
        int numDays = daysInMonth(month, year);

        System.out.printf("%10s %d\n", getMonthName(month), year);
        for (String day : weekDays) {
            System.out.printf("%s ", day);
        }
        System.out.println();

        for (int i = 1; i < startDay; i++) {
            System.out.print("   ");
        }
        for (int i = 1; i <= numDays; i++) {
            if (startDay > 7) {
                startDay = 1;
                System.out.println();
            }
            System.out.printf("%2d ", i);
            startDay++;
        }
        System.out.println();
    }

    public static String getMonthName(int month) {
        String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        return monthNames[month - 1];
    }

}

