/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dataabstraction.obj;

/**
 *
 * @author Rashu
 */
public class Power extends Calculator {

    @Override
    public int calculate(int x, int y) {
        int p=1;
        if (y != 0) {
             for (int i = 1; i <= y; i++) {
                p *= x;  
             }
        }
        return(p);
    }
}   

