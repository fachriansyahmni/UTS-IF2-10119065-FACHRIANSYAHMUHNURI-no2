package uts.if2.pkg10119065.fachriansyahmuhnuri.no2;

/**
 *
 * @author Fachriansyah PC
 */
public class Tabungan {
    private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    
    public int ambilUang(int jumlah)
    {
        return saldo - jumlah; 
    }
}
