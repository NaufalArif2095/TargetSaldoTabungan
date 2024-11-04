/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO1;
import java.text.DecimalFormat;

/**
 *
 * @author HP
 */

public class TargetSaldoTabungan {
    public static void main(String[] args) {
        double saldoAwal = 3500000; // Saldo awal
        double bunga = 0.08; // Bunga per bulan
        double saldoTarget = 6000000; // Saldo target
        int bulan = 1;

        DecimalFormat df = new DecimalFormat("###,###.##");

        while (saldoAwal < saldoTarget) {
            saldoAwal += saldoAwal * bunga;
            System.out.println("Saldo di bulan ke-" + bulan + " Rp. " + df.format(saldoAwal));
            bulan++;
        }
    }
}

