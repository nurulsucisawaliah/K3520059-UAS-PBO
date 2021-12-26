/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpendataankaryawan;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class lihatdata extends abstrack {
    Scanner key = new Scanner(System.in);

    @Override
    int abstrak() {
        System.out.println("Pilih Sub Menu:"
                + "\n1. Kembali ke menu utama"
                + "\nMenu Pilihan: ");
        int menupilihan = key.nextInt();
        return menupilihan ;
    }
}
