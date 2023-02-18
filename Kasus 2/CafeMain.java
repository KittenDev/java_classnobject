/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dafaa.cafe;

/**
 *
 * @author Dafaa
 */

import java.util.Scanner;
     
public class CafeMain {
    
    public static void main(String[] args) {
        Cafe cintaKopi = new Cafe();
        String keputusan;
        Scanner in = new Scanner(System.in);
        
        for(;;){
            cintaKopi.tampilWelcome();
            cintaKopi.tampilMenu();
            cintaKopi.tampilPilihan();
            
            keputusan = in.next();
            
            switch(keputusan){
                case "1" -> cintaKopi.beliProduk();
                default -> System.out.println("Tolong input dengan benar");
            }
            
            if(keputusan.equals("2"))
                break;
        }
        in.close();
    }
}
