
package hitungbangundatar;


public class TestBangunDatar {
    public static void main (String[] args) {
      HitungBangunDatar y[] = new  HitungBangunDatar[3];
      
      PersegiPanjang PP = new PersegiPanjang(1, 5);
      Segitiga SG = new Segitiga (4, 3);
      Persegi PS = new Persegi(2);
      
      y [0] = PP;
      y [1] = SG;
      y [2] = PS;
       for (HitungBangunDatar y1 : y){
           System.out.println("/n" + y1.displayInfo());
       }
    }
}
