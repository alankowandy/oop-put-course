/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task1;

/**
 *
 * @author inf147259
 */
final class Savings {
    String owner;
    int amount;
    int age;
    
    public Savings(String owner, int amount, int age){
        this.owner = owner;
        this.amount = amount;
        this.age = age;
    }
    
    public Savings(String owner, String amount, String age){
        this((Integer.parseInt(amount), owner, age);
    }
    
    void svg(){
        System.out.print("The name of users account: " + owner + " ");
        System.out.print(System.lineSeparator());
        System.out.print("Amount of savings in the accoung: " + amount + " ");
        System.out.print(System.lineSeparator());
        System.out.print("Age of the user: " + age);
        System.out.print(System.lineSeparator());
        System.out.print(System.lineSeparator());
    }
    /*Savings(String owner, String amount){
        this(Integer.parseInt(owner), amount);
    }
    Savings(String n, int i, int a) {
        owner = n;
        amount = i;
        age = a;
    }
*/
}
public class Task2 {
     public static void main(String args[]){
         Savings user1 = new Savings("Alan", 2000);
         Savings user2 = new Savings("Borgo", 10);
         Savings user3 = new Savings("Molly", 179, 18);
         user1.svg();
         user2.svg();
         user3.svg();
         
     }
}
