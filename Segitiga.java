
package hitungbangundatar;


public class Segitiga implements HitungBangunDatar {
   private  final double Alas, Tinggi; 
      public Segitiga (double A, double T){
        Alas = A;
        Tinggi = T;
}
       public double getAlas(){
      return Alas;
  }
        public double  getTinggi(){
      return Tinggi;
  }

    @Override
    public double Luas() {
        return (0.5 *(Alas * Tinggi));
    }

    @Override
    public double Keliling() {
        double X;
       X = (double)Math.sqrt((Alas * Alas) + (Tinggi * Tinggi)) ;
       return ((Alas * Alas) + (Tinggi * Tinggi));
    }

    @Override
    public String displayInfo() {
         return ("SegiTiga" 
               + "\no Alas : " +(float) getAlas()
               + "\no Tinggi : " + (float) getTinggi()
               + "\no Luas : " + (float) Luas()
               + "\no keliling : " + (float) Keliling());
    }
}
