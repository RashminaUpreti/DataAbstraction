/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dataabstraction;

import com.leapfrog.dataabstraction.obj.CalculationFactory;
import com.leapfrog.dataabstraction.obj.Calculator;
import java.util.Scanner;

        

/**
 *
 * @author Rashu
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1.Add");
            System.out.println("2.Sub");
            System.out.println("3.Div");
            System.out.println("4.Mul");
            System.out.println("5.Max");
            System.out.println("6.Min");
            System.out.println("7.Power");
            System.out.println("8.Exit");
            System.out.println("Enter your choice [1-8]:");
            int choice = input.nextInt();
            Calculator c;
            
            switch (choice) {
                case 1:
                  c=CalculationFactory.get("add");
                   calculation(c);
                    break;

                case 2:
                    c=CalculationFactory.get("sub");
                    calculation(c);
                    break;

                case 3:
                     c=CalculationFactory.get("div");
                     calculation(c);
                    break;

                case 4:
                     c=CalculationFactory.get("mul");
                     calculation(c);
                    break;

                case 5:
                     c=CalculationFactory.get("max");
                     calculation(c);
                    break;

                case 6:
                     c=CalculationFactory.get("min");
                     calculation(c);
                    break;

                case 7:
                    c=CalculationFactory.get("power");
                    calculation(c);
                    break;

                case 8:
                    System.exit(0);
                    break;
            }
            System.out.println("Do you want to continue[Y/N]?");
            String ch=input.next();
            if(ch.equalsIgnoreCase("n")){
                System.exit(0);
            }
            
            

        }
        
    }
     public static void calculation(Calculator c){
        if(c!=null){
            int r,s,t;
                     r= c.inputX();
                     s= c.inputY();
                     t= c.calculate(r, s);
                     c.output(t);  
        }else
            System.out.println("No Suitable calculation");
     }      
}
