/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package data.structure.using.java;

import java.util.Scanner;

/**
 *
 * @author dhira
 */
public class DataStructureUsingJava {

    public static void inputArray(int a[],int size) {
        Scanner s = new Scanner(System.in);
            for(int i = 0;i<size;i++){
            System.out.println("Enter the Element at Position "+i);
            a[i] = s.nextInt();
        }
    }
    public static void outputArray(int a[],int size) {
        System.out.println("Array Elements are ");
        for(int i = 0;i<size;i++){
            System.out.println(a[i]);
        }
    }
   
    public static void main(String[] args) {
       
            Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
       int size = s.nextInt();
        int a[] = new int[size];
        inputArray(a,size);
        outputArray(a,size);
        
    }
    
}

    

