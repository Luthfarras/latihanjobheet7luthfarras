/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author Lenovo400S
 */
public class aplikasi {
    public static void main(String[] args) {
        String identitas = "Luthfarras Tresanizega / XRPL5 / 19";
        System.out.println("identitas : "+ identitas);
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);

             int nilai;
             System.out.print("\nNilai Anda ? ");
             nilai = scanner.nextInt();
             
             String grade = (nilai < 75) ? "tidak lulus" : "lulus";
             System.out.println(nilai + " => " + grade);
    
}
