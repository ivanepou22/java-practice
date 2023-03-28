public class SwitchStatement {
    public static void main(String[] args) {
        int switchValue = 1;
        System.out.println(getMonth("MAY")+ " quarter");
    }

    public static String getMonth(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> "Bad";
        };
    }
}
