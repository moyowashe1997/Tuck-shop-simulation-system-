/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exmoyotuckshop;

import java.util.Scanner;

public class ExmoyoTuckShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Exmoyo p = new Exmoyo();
       Teller t = new Teller();
        Scanner scan = new Scanner(System.in);

        int choice = 0;
        p.Main_Menu();

        do {

            System.out.print("Enter Choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    p.adminPassword();
                    break;
                case 2:
                    p.TellerPasword();
                    break;
                case 3:
                    break;
            }

        } while (choice < 3);

    }

}
