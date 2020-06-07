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
public class Jawab1 {
    public static void main(String[] args){
        int n = 0;
        try{
            n = System.in.read();
            
        }catch(java.io.IOException e){
            System.out.println(e);
        
        }
            System.out.println("HASIL : "+ (char)n);
    }
}
