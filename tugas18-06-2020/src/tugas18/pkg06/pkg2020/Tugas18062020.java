/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas18.pkg06.pkg2020;

import java.util.Scanner;

/**
 *
 * @author Rafli
 */
public class Tugas18062020 {

    /**
     * @param args the command line arguments
     */
   
        public static void main(String[] args) {
      //deklarasi variabel
      String nama;
      String nim;
      //memberikan nilia pada varibel secara dinamis
      //memanggil class scanner
      Scanner input_bio=new Scanner (System.in);
      //nama
      System.out.print("Nama:");
      nama=input_bio.nextLine();
      //nim
      System.out.print("NRP :");
      nim=input_bio.nextLine();
      //cetak nama dan nim
      System.out.println("*******************************");
      System.out.println("Nama: "+nama);
      System.out.println("NRP : "+nim); 
    }
}

    

