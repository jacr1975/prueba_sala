/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author asus
 */
public class Asiento {

    public Asiento(String id_as, int id_usuario, String estado, int cont) {
        this.id_as = id_as;
        this.id_usuario = id_usuario;
        this.estado = estado;
        this.cont = cont;
    }


    
    
    
    private String id_as;
    private int id_usuario;
    private String estado;
    private int cont;

    public String getId_as() {
        return id_as;
    }

    public void setId_as(String id_as) {
        this.id_as = id_as;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    
    
}
