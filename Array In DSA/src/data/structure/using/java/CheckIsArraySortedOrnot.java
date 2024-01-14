/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.structure.using.java;

import java.util.Scanner;


public class CheckIsArraySortedOrnot {
    public static String sortedOrNot(int a[],int size) {
        for(int i = 0;i<size-1;i++){
            if(a[i]>a[i+1]) {
                return "Not Sorted";
            }
        }
        
        return "Sorted";
    }
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = s.nextInt();
        int a[] = new int[size];
        for(int i = 0;i<size;i++){
            a[i] = s.nextInt();
        }
        System.out.println(sortedOrNot(a,size));
    }
}
