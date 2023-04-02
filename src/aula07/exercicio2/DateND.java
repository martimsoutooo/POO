package aula07.exercicio2;


public class DateND extends Date {
    private int daysFrom2000;

    public DateND(int day, int month, int year) {
        if (!valid(day, month, year)) {
            throw new IllegalArgumentException("Data inválida.");
        }

        int days = 0;

        for (int y = 2000; y < year; y++) {
            if (leapYear(y)) {
                days += 366;
            } else {
                days += 365;
            }
        }

        for (int m = 1; m < month; m++) {
            days += monthDays(m, year);
        }

        days += day - 1;

        this.daysFrom2000 = days;
    }

    @Override
    public void set(int day, int month, int year) {
        if (!valid(day, month, year)) {
            throw new IllegalArgumentException("Data inválida.");
        }

        int days = 0;

        for (int y = 2000; y < year; y++) {
            if (leapYear(y)) {
                days += 366;
            } else {
                days += 365;
            }
        }

        for (int m = 1; m < month; m++) {
            days += monthDays(m, year);
        }

        days += day - 1;

        this.daysFrom2000 = days;
    }

    @Override
    public int getMonth() {
        int days = this.daysFrom2000;

        int year = 2000;
        while (days >= 365) {
            if (leapYear(year)) {
                if (days >= 366) {
                    days -= 366;
                    year++;
                } else {
                    break;
                }
            } else {
                days -= 365;
                year++;
            }
        }

        int month = 1;
        while (days >= monthDays(month, year)) {
            days -= monthDays(month, year);
            month++;
        }

        return month;
    }

    @Override
    public int getDay() {
        int days = this.daysFrom2000;

        int year = 2000;
        while (days >= 365) {
            if (leapYear(year)) {
                if (days >= 366) {
                    days -= 366;
                    year++;
                } else {
                    break;
                }
            } else {
                days -= 365;
                year++;
            }
        }

        int month = 1;
        while (days >= monthDays(month, year)) {
            days -= monthDays(month, year);
            month++;
        }

        return days + 1;
    }

    @Override
    public int getYear() {
        int days = this.daysFrom2000;

        int year = 2000;
        while (days >= 365) {
            if (leapYear(year)) {
                if (days >= 366) {
                    days -= 366;
                    year++;
                } else {
                    break;
                }
            } else {
                days -= 365;
                year++;
            }
        }

        return year;
    }
}
