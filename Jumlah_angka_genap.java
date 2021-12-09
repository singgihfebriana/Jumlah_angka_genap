/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package proyek_latihan;
import java.util.Scanner;

/**
 *
 * @author singg
 */
public class Jumlah_Bilangan_Genap {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        double a,b,number,get=0;
        int result;
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Masukan angka anda : ");
        a=keyboard.nextDouble();
        for (number=1;number<=a;number++){
            b=(number%2);
        if (b==0){
            get++;
            
            
        }
         continue;
       
        }
        
        System.out.println(get +" jumlah angka genap");
    }
}
