package aula06.exercicio1;

public class DateYMD{
    private int month;
    private int year;
    private int day;

    public DateYMD(int day, int month, int year){
        this.set(day, month, year);
    }

    public static boolean validMonth(int month){
        if (month>12 || month<1) {
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
        if (year%4 == 0 && year%100 != 0 || year % 400 == 0){
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
    public String toString(){
        return "" + this.year + "-" + this.month + "-" + this.day;
    }

    public void set(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;

        if (!valid(day, month, year)){
            throw new IllegalArgumentException("A data não é válida");
        }

    }

    public int getMonth() {
        return month;
    }
    
    public int getDay() {
        return day;
    }

    public  int getYear(int year){
        return year;
    }

    public void increment() {
        this.day++;
        if (this.day > monthDays( this.month,  this.year)) {
            this.day = 1;
            this.month++;
            if (this.month > 12) {
                this.month = 1;
                this.year++;
            }
        }
    }

    public void decrement() {
        this.day--;
        if (this.day < 1) {
            this.month--;
            if (this.month < 1) {
                this.month = 12;
                this.year--;
            }
            this.day = monthDays( this.month,  this.year);
        }
    }

    
}

