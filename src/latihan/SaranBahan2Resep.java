/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author Lenovo400S
 */
public class SaranBahan2Resep {
    public static void main(String[] args) {
        String identitas = "Luthfarras Tresanizega / XRPL5 / 19";
        System.out.println("Identitas :" + identitas);
        
        System.out.print("\nSaran Resep dari Bahan Milik Anda\n");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bahan Pertama: ");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.print("Masukka no pilihan Anda: ");
        int bahan1 = scanner.nextInt();
        
        
    }
    
}
