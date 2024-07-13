public enum Matavimas {
   MILIMETRAS (0.001f, "mm"),
   Centimetras (0.01f, "cm"),
   METRAS (1.0f, "m"),
   KILOMETRAS (1000.0f, "km");

   private float daugiklis;
   private String trumpinys;

   Matavimas(Float x, String y){
      daugiklis = x;
      trumpinys = y;
   }

   public float daugiklis() {
      return daugiklis;
   }

   public String trumpinys() {
      return trumpinys;
   }
}
enum Skaicius {
   Nulis(0),
   Vienas(1),
   DU(2),
   Trys(3),
   Keturi(4),
   Penki(5),
   Sesi(6),
   Septyni(7),
   Astuoni(8),
   Devyni(9);

   private final int numeris;

   Skaicius (int num){
      numeris = num;
   }

   public int numeris() {
      return numeris;
   }
}

class Enumtest {
   public static void main(String[] args){
      System.out.println(Matavimas.MILIMETRAS.equals(Matavimas.KILOMETRAS));
      System.out.println(Matavimas.MILIMETRAS.equals(Matavimas.METRAS));
      System.out.println(Matavimas.MILIMETRAS.equals(Matavimas.MILIMETRAS));
      System.out.println(Skaicius.Penki.numeris() + "." + Skaicius.Nulis.numeris() + " " + Matavimas.MILIMETRAS.trumpinys());
      System.out.println(Skaicius.Penki.numeris() +""+ Skaicius.Nulis.numeris() + Skaicius.Nulis.numeris() +""+ "." + Skaicius.Nulis.numeris() + " " + Matavimas.Centimetras.trumpinys());
      System.out.println( Skaicius.Nulis.numeris() + "."+ Skaicius.Nulis.numeris()+"" + Skaicius.Nulis.numeris() +"" + Skaicius.Penki.numeris() + " " + Matavimas.KILOMETRAS.trumpinys());
   }
}