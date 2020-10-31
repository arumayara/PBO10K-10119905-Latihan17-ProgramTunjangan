/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan17.ProgramTunjangan;

import java.util.Scanner;
/**
 *
 * @author
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program Tunjangan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float GajiPokok;
        float TotalGaji;
        float Tunjangan;
        String Status;
        
        var scanner = new Scanner(System.in);      
        
        System.out.println("========== Program Gaji Pokok ==========");
        System.out.println("Berapa Gaji Pokok Anda Perbulan ? : ");
        GajiPokok = scanner.nextFloat();
        
        System.out.println("Status Anda? (Menikah/Belum)      : ");
        Status = scanner.next();
        
        if (Status.equals("Menikah")){
            Tunjangan = GajiPokok*35/100;
        } else {           
            Tunjangan = 0;    
        }            
        TotalGaji= GajiPokok + Tunjangan;
        
        System.out.println();
        System.out.println("====== Hasil Perhitungan Gaji Anda ======");
        System.out.println("Gaji Pokok     : "+ GajiPokok);
        System.out.println("Tunjangan      : "+ Tunjangan);
        System.out.println("Total Gaji     : "+ TotalGaji);
        System.out.println("(Develloped by Abraham Rumayara)");
        
    }
    
}
