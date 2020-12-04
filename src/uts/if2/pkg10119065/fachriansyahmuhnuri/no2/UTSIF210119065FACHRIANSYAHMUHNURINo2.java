package uts.if2.pkg10119065.fachriansyahmuhnuri.no2;

import java.util.Scanner;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program tabungan
 */
public class UTSIF210119065FACHRIANSYAHMUHNURINo2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== Program Penarikan Uang =====");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tabungan = new Tabungan(sc.nextInt());
        System.out.print("Jumlah Uang yang akan diambil : ");
        System.out.println("Saldo Anda Sekarang : "+ tabungan.ambilUang(sc.nextInt()));
        
    }
    
}
