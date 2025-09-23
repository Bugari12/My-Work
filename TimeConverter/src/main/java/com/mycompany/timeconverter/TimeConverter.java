/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.timeconverter;

import java.util.Scanner;
public class TimeConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the total number of seconds:  ");
        int totalSeconds = scanner.nextInt();
        
        int minutes = totalSeconds / 60;
        
        int remainingSeconds = totalSeconds % 60;
        
        System.out.println(totalSeconds + " seconds is " +minutes+ "minutes and " + remainingSeconds + "seconds. ");
        
        scanner.close();
    }
}
