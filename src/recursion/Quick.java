/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion;

/**
 *
 * @author Ryle
 */
public class Quick {

     static int recFun(int num) {

        if (num <= 1) {
            return 1;
        }

        if (num % 2 == 0) {

            return recFun(num / 2);

        } 
            return recFun(num - 1) + 1;
            

        
    }

    public static void main(String[] args) {

        System.out.println(recFun(6));
    }
}
