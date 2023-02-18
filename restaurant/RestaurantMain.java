/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

/**
 *
 * @author Dafaa
 */
public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        
        menu.tampilMenuMakanan();
        
        menu.pesanMakanan("Molen", 10);
        
        System.out.println("Stok setelah dipesan: ");
        menu.tampilMenuMakanan();
    }
}
