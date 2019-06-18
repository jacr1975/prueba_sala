/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import ejb.EjbSala;
import entidades.Fila;
import entidades.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author asus
 */
@Named(value = "usuario")
@SessionScoped
public class usuario  implements Serializable{

    /**
     * Creates a new instance of usuario
     */
    public usuario() {
    }
    
           List<Usuario> usuarios = new ArrayList<>();

    @Inject
    private EjbSala cont;
    @PostConstruct
    public void init() {

    }
    
    
}
