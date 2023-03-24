package aula05;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendario calendar = null;
        int choice = 1;
        while (choice != 0) {
            System.out.println("Calendar operations:");
            System.out.println("1 - create new calendar");
            System.out.println("2 - print calendar month");
            System.out.println("3 - print calendar");
            System.out.println("0 - exit");
            System.out.print("Your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter year: ");
                    int year = sc.nextInt();
                    System.out.print("Enter first weekday of the year (1-Sunday, 7-Saturday): ");
                    int firstWeekdayOfYear = sc.nextInt();
                    calendar = new Calendario(year, firstWeekdayOfYear);
                    break;
                case 2:
                    System.out.print("Enter month (1-12): ");
                    int month = sc.nextInt();
                    System.out.println(calendar.printMonth(month));
                    break;
                case 3:
                    System.out.println(calendar.toString());
                    break;
                case 0:
                    break;
                    
                    
                default:
                    System.out.println("Invalid choice");
            }
            
        }
       sc.close();
    }
}

