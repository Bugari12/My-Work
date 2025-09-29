/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hex;

import java.util.Scanner;

public class Hex {
    public static void main(String[] args) {
        Scanner save = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hex = save.nextLine();

        int decimal = Integer.parseInt(hex, 16);

        System.out.println("The decimal value is: " + decimal);
    }
}


