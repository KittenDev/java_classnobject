/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dafaa.cafe;

/**
 *
 * @author Dafaa
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cafe {
    private final Produk[] menu;
    
    public Cafe(){
        this.menu = new Produk[10];
        menu[0] = new Produk("Single Espresso", 22000, 20);
        menu[1] = new Produk("Double Espresso", 35000, 20);
        menu[2] = new Produk("Americano", 35000, 20);
        menu[3] = new Produk("Caffe Latte", 40000, 20);
        menu[4] = new Produk("Cappuccino", 40000, 20);
        menu[5] = new Produk("Flat White", 35000, 20);
        menu[6] = new Produk("Piccolo", 40000, 20);
        menu[7] = new Produk("Macchiato", 40000, 20);
        menu[8] = new Produk("Caffe Mocha", 42000, 20);
        menu[9] = new Produk("House Signature", 45000, 20);
    }
    
    public void tampilPilihan(){
        System.out.println("1. Pesan sesuatu");
        System.out.println("2. Keluar Program");
    }
    
    public void tampilMenu(){
        System.out.println("===========================================");
        for(int i = 0; i < 10; i++){
            System.out.print((i + 1) + ". ");
            menu[i].tampilProduk();
        }
        System.out.println("===========================================");
    }
    
    public void tampilWelcome() {
        System.out.println("===========================================");
        System.out.println("SELAMAT DATANG DI CINTA KOPI <3");
        System.out.println("===========================================");
    }
    
    public void tampilThankYou() {
        System.out.println("===========================================");
        System.out.println("TERIMA KASIH, SEMOGA IP KAMU 4");
        System.out.println("===========================================");
        System.out.printf("%n %n %n");
    }
    
    public void beliProduk(){
        Scanner keyboard = new Scanner(System.in);
        Penjualan pembeli = new Penjualan();
        String keputusan = "Y";
        int qty = 0;
        int pilihanMenu = 0;
        
        for(;;){
            for(;;){
                System.out.println("Apa yang mau dibeli?(1 - 10)");
                for(;;){
                    try{
                        pilihanMenu = keyboard.nextInt();
                        break;
                    }
                    catch(InputMismatchException exception){
                        System.out.println("Input tolong integer");
                        keyboard.nextLine();
                    }
                }
                
                if(pilihanMenu > 0 && pilihanMenu < 11){
                    System.out.println("Berapa banyak yang mau dibeli?");
                    for(;;){
                        try{
                            qty = keyboard.nextInt();
                            break;
                        }
                        catch(InputMismatchException exception){
                            System.out.println("Input tolong integer");
                            keyboard.nextLine();
                        }
                    }
                    
                    if( this.menu[pilihanMenu - 1].getQty() == 0){
                        System.out.println("Ga bisa dibeli, menu lagi habis");
                    }else if( this.menu[pilihanMenu - 1].getQty() < qty){
                        System.out.println("Ga bisa dibeli, menu lagi habis");
                    }else{
                        pembeli.beliProduk(this.menu[pilihanMenu - 1], qty);
                        this.menu[pilihanMenu - 1].setQty(qty);
                        pembeli.tampilPesanan();
                    }
                    break;
                }else{
                    System.out.println("Tolong input sesuai dengan range");
                }
            }
            
            System.out.println("Apakah mau pesan lagi??(Y/N)");
            for(;;){
                keputusan = keyboard.next();
                if(keputusan.equals("Y") || keputusan.equals("N"))
                    break;
                else
                    System.out.println("Tolong input yang benar");
            }
            if(keputusan.equals("N")){
                pembeli.tampilPesanan();
                tampilThankYou();
                break;
            }
        }
    }
}
