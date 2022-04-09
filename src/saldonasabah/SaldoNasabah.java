/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saldonasabah;

import java.util.Scanner;

/**
 *
 * @author Zephyrus
 */
public class SaldoNasabah {

    /**
     * @param saldoAwal
     */
    public static double admin(double saldoAwal, double saldoSetor) {
        int biayaAdmin = 7000;
        double jumlahSaldo = saldoAwal + saldoSetor;
        double admin = jumlahSaldo - biayaAdmin;
        return admin;
    }
    public static double saldoTotal(double saldoAwal, double saldoSetor) {
        double bonus = 0.05/100;
        double saldoAkhir = admin(saldoAwal, saldoSetor)*bonus;
        double total = admin(saldoAwal, saldoSetor)+saldoAkhir;
        return total;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double saldoAwal = scan.nextInt();
        double saldoSetor = scan.nextInt();
        System.out.println(saldoTotal(saldoAwal, saldoSetor));
    }
}
