/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpendataankaryawan;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class karyawan {
    String  nama, alamat, gol, status, tangglLahir;
    int  kodeKary, JmlhAnak;
    Scanner key = new Scanner(System.in);
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    
    karyawan(int kode, String nama, String alamat, String tangglLahir, String gol, String status, int JmlhAnak){
        this.kodeKary = kode;
        this.nama = nama;
        this.alamat = alamat;
        this.tangglLahir = tangglLahir;
        this.gol = gol;
        this.status = status;
        this.JmlhAnak = JmlhAnak;
    }
    
    void print(){
        LocalDate localDate = LocalDate.parse(this.tangglLahir);
        LocalDate today = LocalDate.now();
        Period selisih = Period.between(localDate, today);
        System.out.println(this.kodeKary+"\t"+this.nama+"\t"+this.gol+"\t"+selisih+"\t"+this.status+"\t"+this.JmlhAnak);
    }
    
    void cari(){
        LocalDate localDate = LocalDate.parse(this.tangglLahir);
        LocalDate today = LocalDate.now();
        Period selisih = Period.between(localDate, today);
        System.out.println("Kode Karyawan: " + this.kodeKary
        + "\nNama Karyawan: " + this.nama
        + "\nGolongan: " + this.gol
        + "\nUsia: " + selisih
        + "\nStatus Menikah: " + this.status
        + "\nJumlah Anak: " + this.JmlhAnak);
        int Gaji = 0, tunjanganNikah = 0, tunjanganAnak = 0, tunjangan = 0;
        if(null != this.gol)switch (this.gol) {
            case "A":
                Gaji = 5000000;
                break;
            case "B":
                Gaji = 6000000;
                break;
            case "C":
                Gaji = 7000000;
                break;
            case "D":
                Gaji = 8000000;
                break;
            default:
                break;
        }
        if (this.status == "1" || this.status == "Sudah Menikah"){
            tunjanganNikah = 10/100 * Gaji;
            tunjanganAnak = 5/100 * Gaji * this.JmlhAnak;
            tunjangan = tunjanganNikah + tunjanganAnak;
        }
        int GajiKotor = Gaji + tunjangan;
        double potongan = 2.5/100 * Gaji; 
        double GajiBersih = GajiKotor - potongan;
        
        System.out.println("Gaji Pokok: Rp " + Gaji
        + "\nTunjangan Istri/Suami: Rp " + tunjanganNikah
        + "\nTunjangan Anak: Rp " + tunjanganAnak);
        System.out.println("====================================");
        System.out.println("Gaji Kotor: Rp " + GajiKotor
        + "\nPotongan: Rp " + potongan);
        System.out.println("====================================");
        System.out.println("Gaji Bersih: Rp " + GajiBersih);
    }
    
}
