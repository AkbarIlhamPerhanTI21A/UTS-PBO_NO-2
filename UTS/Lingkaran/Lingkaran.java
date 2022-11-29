/*
 * UTS PBO
 * Akbar Ilham Perhan
 * 20210040083
 * TI21A
 */

package UTS.Lingkaran;
import UTS.BangunDatar.BangunDatar;

public class Lingkaran implements BangunDatar {
     private  int jari;
      public Lingkaran (int jari){
          this.jari = jari;
      }

    @Override
    public double luas() {
       return (Math.PI * jari * jari)/2; 
    }
}
