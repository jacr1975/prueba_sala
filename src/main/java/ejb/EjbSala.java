/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entidades.Asiento;
import entidades.Fila;
import entidades.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author asus
 */
@Stateless
public class EjbSala {

   /*public List<Asiento>[] loadAllAsientos() {

        List<Asiento>[] asientos = new ArrayList[10];
        int cont = 0;
        int cont1 = 0;
        
        Asiento asi = new Asiento(0,"1");
        
        while(cont < asientos.length){
            while(cont1 < 10){
                asientos[0].add(asi);
                ++cont1;
            }
            
            ++cont;
        }
        
        
        return asientos;
    }*/
    
    
  public List<Fila> loadAllFilas() {

        List<Fila> filas = new ArrayList<Fila>();
        int cont = 0;
        int cont1 = 0;
        
        Asiento asi = new Asiento("1",0,"1",0);
        Fila fila;
        String[] let = {"A", "B","C", "D","E", "F","G", "H","I", "J"};
        Asiento[] asientos = new Asiento[10];
        String idas = "";
            while(cont < 20){
                            while(cont1 < 10){
                   idas = String.valueOf(cont)+let[cont1];
                   
                   System.out.println("cont "+cont+" cont1 "+cont1+" asi "+idas);
                   asientos[cont1] = new Asiento(idas,0,"1",0);
                   idas = "";
                cont1++;
            }
              cont1 = 0;              
                            fila = new Fila(asientos[0],asientos[1],asientos[2],asientos[3],asientos[4],asientos[5],asientos[6],asientos[7],asientos[8],asientos[9]);
                filas.add(fila);
                cont++;
                    System.out.println("cont "+cont);
                
            }
        
        
        return filas;
    }  
    

        
            public Usuario addNewAlumno(Usuario us) {
        Usuario newUser = new Usuario();
       
        newUser.setNombre(us.getNombre());
        newUser.setCiudad(us.getCiudad());
        newUser.setDireccion(us.getDireccion());        

       return newUser;
    }
    
  
  
    
}
