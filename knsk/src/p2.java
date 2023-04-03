/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nithin
 */
public class p2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Byte b;
        int i=257;
        double d=323.142;
        System.out.println("Conversion of int to byte");
        b=(byte)i;
        System.out.println("i="+i+"and b="+b);
        System.out.println("Conversion of double to int");
        i=(int)d;
        System.out.println("d and i"+d+""+i);
        System.out.println("Conversion of double to byte");
        b=(byte)d;
        System.out.println("d and b"+d+""+b);
    }
    
}
