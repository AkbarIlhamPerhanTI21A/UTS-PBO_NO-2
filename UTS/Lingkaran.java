/*
 * UTS PBO
 * Akbar Ilham Perhan
 * 20210040083
 * TI21A
 */

package UTS;

public class Lingkaran implements BangunDatar {
    private int jari;

    public Lingkaran(int jari) {
        this.jari = jari;

    }

    @Override
    public double luas() {
        return (3.14 * jari * jari) / 2 ;
    }
}
