/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package other;

/**
 *
 * @author nithin
 */
public class subsequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "abc";
        for(int i = 1; i <= str.length(); i++) {
        for(int j = 0; j <= str.length() - i; j++) {
            int k = j + i - 1;
            for(int l = j; l <= k; l++) System.out.print(str.charAt(l));
            System.out.println();
        }
        }
    }
    
}
