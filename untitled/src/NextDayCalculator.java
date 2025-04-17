public class NextDayCalculator {
    public static final String CONCAT = "/";
    public static final int FIRST_OF_MONTH = 1;

    public static String getDay(int day, int month, int year) {
        int lastOfMonth = getLastOfMonth(month, year);

        if (day == lastOfMonth) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        } else {
            day++;
        }

        return day + CONCAT + month + CONCAT + year;
    }

    private static int getLastOfMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                throw new IllegalArgumentException("Tháng không hợp lệ: " + month);
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
