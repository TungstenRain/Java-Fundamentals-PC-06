/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2pc06;

/**
 * 
 * @purpose: Calculate the acres
 * @author FRANK.OLSON
 * @date 10/18/2017
 */
public class Ch2PC06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double acre = 43560;  //square feet in an acre
        double tract = 389767;      //tract of land available
        double acreage;             //variable to store calculation
        
        //calculation
        acreage = tract/acre;
        //output
        System.out.println("The number of acres in " + tract + 
                " square feet is: " + acreage + " acres.");
    }
}
