/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pakjm;

/**
 *
 * @author Igum
 */
public class Soal3 {
     public static void main(String [] args){
        byte[] b = new byte[5];
        System.out.println("input bilangan bulat : ");
        
        try{
            
            System.in.read(b);
        }catch(java.io.IOException er){
            
            int n = Integer.valueOf(b).intValue();
            System.out.println("Out : "+(n+2));
        }
    }
}
