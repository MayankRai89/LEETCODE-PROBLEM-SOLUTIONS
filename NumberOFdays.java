
public class NumberOFdays {
    public static boolean isleapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static int totaldays(String date) {
        int[] monthDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] arr = date.split("-");
        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);

        int total = 0;
        for (int y = 1; y < year; y++) {
            total += isleapYear(y) ? 366 : 365;
        }
        for (int m = 1; m < month; m++) {
            total += monthDays[m - 1];
            if (m == 2 && isleapYear(year)) {
                total++;
            }
        }
        total += day;
        return total;
    }

    public static int daysBwDates(String date1, String date2) {
        return Math.abs(totaldays(date1) - totaldays(date2));
    }

    public static void main(String[] args) {
        String date1 = "2019-06-29";
        String date2 = "2017-06-30";
        int result = daysBwDates(date1, date2);
        System.out.println("The total number of days are " + result);
    }
}
