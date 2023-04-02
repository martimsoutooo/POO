package aula07.exercicio2;

public abstract class Date {
    public abstract void set(int day, int month, int year);
    public abstract int getMonth();
    public abstract int getDay();
    public abstract int getYear();

    public static boolean validMonth(int month){
        if (month > 12 || month < 1) {
            return false;
        } else {
            return true;
        } 
    }

    public static int monthDays(int month, int year){
        switch(month){
            case 2:
                if (leapYear(year)){
                    return 29;
                }
                else{
                    return 28;
                }
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }

    public static boolean leapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean valid(int day, int month, int year){
        if (validMonth(month) && day >= 1 && day <= monthDays(month, year) && year > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void increment() {
        int day = this.getDay() + 1;
        int month = this.getMonth();
        int year = this.getYear();

        if (day > monthDays(month, year)) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }

        this.set(day, month, year);
    }

    public void decrement() {
        int day = this.getDay() - 1;
        int month = this.getMonth();
        int year = this.getYear();

        if (day < 1) {
            month--;
            if (month < 1) {
                month = 12;
                year--;
            }
            day = monthDays(month, year);
        }

        this.set(day, month, year);
    }

    public String toString() {
        return "Date: " + this.getYear() + "-" + this.getMonth() + "-" + this.getDay();
    }
}

