/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjava;

/**
 *
 * @author Yuliana Putri
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;
	for (int a=1; a<=n; a++) {
            for (int b=1; b<=n; b++) {
                if (a==1 || a==n || b==1 || b==n) {
                    System.out.print("#");
                }
                else {
                    System.out.print("*");
                }
   }
            System.out.println();
        }
    }
    
}
