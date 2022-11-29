/*
 * UTS PBO
 * Akbar Ilham Perhan
 * 20210040083
 * TI21A
 */

package UTS.PersegiPanjang;
import UTS.BangunDatar.BangunDatar;

public class PersegiPanjang implements BangunDatar{
 private int panjang;
 private int lebar;
 public PersegiPanjang(int panjang, int lebar){
 this.panjang = panjang;
 this.lebar = lebar;
 }
    @Override
    public double luas() {
        return panjang * lebar; //To change body of generated methods, choose Tools | Templates.
    }

}

