import java.util.Scanner;
import static java.lang.System.*;

public class Masyvai {
    public static String[] Vardai = new String[10];


    public static void main (String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Įveskite 10 vardu : ");
        for( int i = 0 ; i < 10 ;) {
            Masyvai.Vardai[i] = sc.next();
            i++;
        }
        for (int i = 0; i<10; i++){
            out.println(Masyvai.Vardai[i].concat(" " + String.valueOf(Masyvai.Vardai[i].length() ) ) + " " + i );
        }
        for (int i = 1; i<=10;i++){
            String Line = "";
            for (int j = 0; j<i; j++){
                Line += "*";}
        out.println(Line);
        }
        
            
}
}




/*
.length
System.arraycopy()
 */