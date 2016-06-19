
package hitungbangundatar;


public class PersegiPanjang implements HitungBangunDatar {
private final double panjang, lebar;

    public PersegiPanjang (double p, double l){
        panjang = p;
        lebar = l;
}
  public double  getPanjang(){
      return panjang;
  }
   public double  getlebar(){
      return lebar;
  }

    @Override
    public double Luas() {
      return  (panjang * lebar);
    }

    @Override
    public double Keliling() {
       return (2 * (panjang * lebar));
    }

    @Override
    public String displayInfo() {
       return ("PersegiPanjang" 
               + "\no Panjang : " +(float) getPanjang()
               + "\no Lebar : " + (float) getlebar()
               + "\no Luas : " + (float) Luas()
               + "\no keliling : " + (float) Keliling());
    }

    
  
}
