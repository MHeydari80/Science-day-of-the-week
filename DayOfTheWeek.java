package dayoftheweek;

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int day, month, date, year, weekDay;
        String wekkDayName;

        System.out.println("Enter year: (e.g., 2012)");
        year = input.nextInt();

        System.out.println("Enter month: 1-12");
        month = input.nextInt();

        if (month == 1 || month == 2) {

            year -= 1;
            month += 12;
        }

        System.out.println("Enter the day of the month: 1-31");
        date = input.nextInt();

        weekDay = (date + ((26 * month + 26) / 10) + (year % 100) + ((year % 100) / 4)
                + ((year / 100) / 4) + (5 * (year / 100))) % 7;

        switch (weekDay) {

            case 0:
                System.out.println("Day of the week is Saturday!");
                break;

            case 1:
                System.out.println("Day of the week is Sunday!");
                break;

            case 2:
                System.out.println("Day of the week is Monday!");
                break;

            case 3:
                System.out.println("Day of the week is Tuesday!");
                break;

            case 4:
                System.out.println("Day of the week is Wednesday!");
                break;

            case 5:
                System.out.println("Day of the week is Thursday!");
                break;

            case 6:
                System.out.println("Day of the week is Friday!");
                break;

        }
    }

}
