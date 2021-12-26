/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpendataankaryawan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class data {
    ArrayList<karyawan> data = new ArrayList<karyawan>();
    Scanner key = new Scanner(System.in);
    void tambahKaryawan(karyawan data){
        this.data.add(data);
    }

    void tampilKaryawan(){
        for(karyawan data: this.data){
            data.print();
        }
    }
    
    void cariData(int kode){
        boolean find = false;
        int index = -1;
        for(int i = 0; i < this.data.size(); i++){
            if(this.data.get(i).kodeKary == kode){
                index = i;
                find = true;
            }
        }
        
        if(find == true){
            this.data.get(index).cari();
        } else{
            System.out.println("Data Karyawan tidak ditemukan");
        }
    }
    
    void hapusData(int kode){
        this.data.removeIf(data -> data.kodeKary== kode);
    }
    
    public int jumlahKaryawan(){
        return data.size();
    }
}
