import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Iveskite zodi : Namas");


       String pav = sc.next();
       System.out.println(pav);

       String pav1 =pav.replace('s','i');
       System.out.println(pav1);

       String pav2 =pav1.toUpperCase();
       System.out.println(pav2);

       String pav3 = pav2.substring(2,4);
       System.out.println(pav3);

       String pav4 = pav3.concat(pav3.toLowerCase());
       System.out.println(pav4);

       String pav5 = pav4.replace(pav4.charAt(pav4.indexOf('m')), 'n');
       System.out.println(pav5);

       System.out.println(pav5.indexOf("n"));
    }
}
