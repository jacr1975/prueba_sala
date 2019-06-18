/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entidades.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asus
 */
public class prueba {
    
    public static void main(String args[]){
        List<Integer> usu = new ArrayList<>();
        usu.add(1);
                usu.add(5);
                int con = 0;
                for(int a : usu){
                    con = a;
                }
                
         System.out.println("con "+con);      
                
        
        
        System.out.println(usu.size());
        
    }
    
    
    
    
}
