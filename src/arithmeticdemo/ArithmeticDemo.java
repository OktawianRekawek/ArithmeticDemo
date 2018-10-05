/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticdemo;

/**
 *
 * @author Oktawian
 */
public class ArithmeticDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int result = 1 + 2;
        //result is now 3
        System.out.println("1 + 2 = " + result);
        int originalResult = result;
        
        result = result - 1;
        System.out.println(originalResult + " - 1 = " + result);
        originalResult = result;
        
        result = result * 2;
        System.out.println(originalResult + " * 2 = " + result);
        originalResult = result;
        
        result = result / 2;
        System.out.println(originalResult + " / 2 = " + result);
        originalResult = result;
        
        result = result + 8;
        System.out.println(originalResult + " + 8 = " + result);
        originalResult = result;
        
        result = result%7;
        System.out.println(originalResult + " % 7 = "+result);
        
        
        
        
    }
    
}
