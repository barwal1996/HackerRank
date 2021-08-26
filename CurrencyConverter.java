import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();

        sc.close();

        Locale INDIA = new Locale("en","IN");//creates a new locale with Eng as lang and Ind as country

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(INDIA).format(payment);
        String china  = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US :"+us);
        System.out.println("INDIA :"+india);
        System.out.println("China :"+china);
        System.out.println("France :"+france);
    }
}
/* OUTPUT : 

123214.23
US :$123,214.23
INDIA :₹ 123,214.23
China :￥123,214.23
France :123 214,23 €

*/