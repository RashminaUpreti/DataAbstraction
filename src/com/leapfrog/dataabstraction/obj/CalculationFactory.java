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
public class CalculationFactory {
    public static Calculator get(String key){
        if(key.equalsIgnoreCase("add")){
            return new Add();
        }else if(key.equalsIgnoreCase("sub")){
            return new Sub();
        }else if(key.equalsIgnoreCase("mul")){
            return new Mul();
        }else if(key.equalsIgnoreCase("div")){
            return new Div();
        }else if(key.equalsIgnoreCase("max")){
            return new Max();
        }else if(key.equalsIgnoreCase("min")){
            return new Min();
        }else if(key.equalsIgnoreCase("power")){
            return new Power();
        }else
            return null;
    }
    
}
