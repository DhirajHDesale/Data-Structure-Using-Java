/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.structure.using.java;
import java.util.Scanner;
public class InsertAndDeleteInArray {
    
    public static void inputArray(int a[],int size) {
        Scanner s = new Scanner(System.in);
            for(int i = 0;i<size;i++){
            System.out.println("Enter the Element at Position "+i);
            a[i] = s.nextInt();
        }
    }
    public static void insertElementInArray(int a[],int size) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the index for inserting element ");
        int index = s.nextInt();
        System.out.println("Enter the Element for Inserting In Array");
        int element = s.nextInt();
        for(int i = size;i>index;i--){
            a[i] = a[i-1];
        }
        a[index] = element;
        size++;
    }
    
    public static void deleteElementInArray(int a[],int size) {
        Scanner s = new Scanner(System.in);
       
                System.out.println("Enter the Position for deleting element");
                 int index = s.nextInt();
               for(int i = index;i<size-1;i++) {
                     a[i] = a[i+1];
                 }
                 size--;
                 a[size] = 0;
              
    }
    
    public static void outputArray(int a[],int size) {
        System.out.println("Array element are");
        for(int i = 0;i<size;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = s.nextInt();
        int a[] = new int[size+1];
        inputArray(a,size);
        outputArray(a,size);
        insertElementInArray(a,size);
        System.out.println("After Inserting Element");
        outputArray(a,size+1);
        deleteElementInArray(a,size);
        System.out.println("After Deleting Element");
        outputArray(a,size);
    }
}
