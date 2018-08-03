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
public class CobaPercabangan {
    public static void main(String[] args) {
        String identitas = "Luthfarras Tresanizega / XRPL5 / 19";
        System.out.println("identitas : "+ identitas);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nilai a ? ");
        int a = scanner.nextInt();
        
        System.out.println("\nIF.. 1");
        if (a < 5) System.out.println("nilai a kurang dari 5");
        
        System.out.println("\nIF..2");
        if (a == 5)
             System.out.println("nilai a sama dengan 5");
        
        System.out.println("\nIF.. 3");
        if (a > 5);
             System.out.println("isi variabel a : "+ a);
             System.out.println("nilai a lebih dari 5");
    
    System.out.println("\nIF..ELSE..");
             if (a > 5) {
                 System.out.println("isi variabel a : "+ a);
                 System.out.println("nilai a kurang dari 5");
             } else System.out.println("nilai a lebih dari atau sama dengan 5");
             
              System.out.println("\nNested IF");
             if (a < 7) {
                 System.out.println("nilai a kurang dari 7");
                 if (a < 2)
                     System.out.println("nilai a kurang dari 2");
                 if (a < 4)
                     System.out.println("nilai a kurang dari 4");
    }
}
