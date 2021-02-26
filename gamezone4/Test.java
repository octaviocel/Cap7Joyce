/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
        Eliza eliza= new Eliza();
        Boolean platica= false;
        Scanner pen = new Scanner(System.in);
        
        System.out.println("Platica con Eliza");

        
        do{
            String n=pen.nextLine();
            //System.out.println(n);
            platica = eliza.interactuar(n);
            eliza.getRespuesta();
        }while(platica!=true);
    }
}
