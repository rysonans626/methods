import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        var isLeap = checkYear(1223);
        printLeap(isLeap, 1223);
        proposeOS(0, 2021);
        System.out.println(deliveryDate(95));
    }

    static boolean checkYear(int year) {
        return java.time.Year.of(year).isLeap();
    }

    static void printLeap(boolean isLeapYear, int year) {
        String xxx = isLeapYear
                ? year + " -- високосный год"
                : year + " -- не високосный год";
        System.out.println(xxx);
    }

    // =============

    static void proposeOS(int os, int year) {
        String aaa = "";
        aaa = os == 0 ? "IOS" : "Android";
        int currentYear = LocalDate.now().getYear();
        String xxx = year < currentYear
                ? ("Предлагаем вам lite версию для ") + aaa
                : ("Предлагаем вам обычную версию для ") + aaa;
        System.out.println(xxx);
    }

    // ============

    static String deliveryDate(int distance) {
        var deliveryCounter = 0;
        if (distance < 20) {
            deliveryCounter = 1;
        } else if (distance >= 20 && distance < 60) {
            deliveryCounter = 2;
        } else if (distance >= 60 && distance < 100) {
            deliveryCounter = 3;
        }
        return "Потребуется дней: " + deliveryCounter;
    }
}