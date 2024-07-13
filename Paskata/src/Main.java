import java.security.PublicKey;
import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        M1();
        spausdink();
    }

    public static void M1(){
        System.out.println(" Pirmas Metodas ");
        M2();
    }
    public static void M2(){
        System.out.println(" Antras Metodas ");
        M3();
    }
    public static void M3(){
        System.out.println(" Trecias Metodas ");
    }


    public static void spausdink(){
        System.out.println("iveskite varda");
        String Tekstas = sc.nextLine();
        System.out.println("Kalba");
        String Kodas = sc.nextLine();
        System.out.println("Savaitciu skaiciu");
        String Skaicius = sc.nextLine();
        Metodas1(Tekstas, Kodas, Skaicius);
        Metodas1(Tekstas, Kodas);

    }

    public static void Metodas1(String Tekstas, String Kodas, String Skaicius){
        System.out.println("Aš " + Tekstas + ", tikrai išmoksiu programuoti " + Kodas + " kalba per " + Skaicius + " savaites.");
    }
    public static void Metodas1(String Tekstas, String Kodas){
        System.out.println("Aš " + Tekstas + ", tikrai išmoksiu programuoti " + Kodas + " kalba");
    }


}

