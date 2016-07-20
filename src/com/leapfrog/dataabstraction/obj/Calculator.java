/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dataabstraction.obj;

import java.util.Scanner;


/**
 *
 * @author Rashu
 */
public abstract class Calculator {
 Scanner input = new Scanner(System.in);
    public int inputX(){
        System.out.println("Enter x:");
         int x = input.nextInt();
         return x;
    } 
    public int inputY(){
        System.out.println("Enter y:");
         int y = input.nextInt();
         return y;
    } 
    
    public abstract int calculate(int x,int y);
    
    public void output(int z){
        System.out.println("Output is:"+z);
        
    }
    
   
    }
     
}
