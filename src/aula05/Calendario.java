package aula05;

import java.util.Arrays;

public class Calendario {
    private int year;
    private int firstWeekdayOfYear;
    private int[][] eventos;
    String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public Calendario(int year, int firstWeekdayOfYear) {
        this.year = year;
        this.firstWeekdayOfYear = firstWeekdayOfYear;
        this.eventos = new int[12][];
        for (int i = 0; i < 12; i++) {
            int daysInMonth = DateYMD.monthDays(i + 1, year);
            this.eventos[i] = new int[daysInMonth];
            Arrays.fill(this.eventos[i], 0);
        }
    }

    public int year() {
        return year;
    }

    public int firstWeekdayOfYear() {
        return firstWeekdayOfYear;
    }

    public int firstWeekdayOfMonth(int month) {
        int var = firstWeekdayOfYear();
        for (int i = 1; i < month; i++){
            var += DateYMD.monthDays(i, this.year);
        }
        var %= 7;
        return var ==0 ? 7 : var;
    }

    public void addEvent(DateYMD date) {
        int month = date.getMonth();
        int day = date.getDay();
        if (eventos[month - 1][day - 1] == 0) {
            eventos[month - 1][day - 1] = 1;
        }
    }

    public void removeEvent(DateYMD date) {
        int month = date.getMonth();
        int day = date.getDay();
        if (eventos[month - 1][day - 1] == 1) {
            eventos[month - 1][day - 1] = 0;
        }
    }

    public String printMonth(int month) {
        StringBuilder sb = new StringBuilder();
        String monthTitle = months[month-1] + " " + year;
        int len = 10 + ((int) monthTitle.length() / 2);
        sb.append(String.format("%" + len + "s\n", monthTitle));
        sb.append("Su Mo Tu We Th Fr Sa\n");
        int daysInMonth = DateYMD.monthDays(month, year);
        int firstWeekdayOfMonth = firstWeekdayOfMonth(month);
        int currentWeekday = 1;
        for (int i = 1; i < firstWeekdayOfMonth; i++) {
            sb.append("   ");
            currentWeekday++;

        }
        for (int i = 1; i <= daysInMonth; i++) {
            if (eventos[month - 1][i - 1] == 1) {
                sb.append("* ");
            } else {
                sb.append(String.format("%2d ", i));
            }
            currentWeekday++;
            if (currentWeekday == 8) {
                sb.append("\n");
                currentWeekday = 1;
            }
        }
        sb.append("\n");
        return sb.toString();
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 12; i++) {
            sb.append(printMonth(i));
            sb.append("\n");
        }
        return sb.toString();
    }
    
}
