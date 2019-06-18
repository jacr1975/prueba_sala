/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import ejb.EjbSala;
import entidades.Asiento;
import entidades.Fila;
import entidades.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author asus
 */
@Named(value = "sala")
@SessionScoped
public class sala implements Serializable {

    /**
     * Creates a new instance of sala
     */
    public sala() {
    }

    List<Fila> filas;
    List<Usuario> usuarios = new ArrayList<>();
    private Usuario us = new Usuario();
    private Usuario us2 = new Usuario();
    private String style;
    private int est;

    @Inject
    private EjbSala cont;

    @PostConstruct
    public void init() {
        this.filas = cont.loadAllFilas();
    }

    public List<Fila> getFilas() {
        return filas;
    }

    public void setFilas(List<Fila> filas) {
        this.filas = filas;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public EjbSala getCont() {
        return cont;
    }

    public void setCont(EjbSala cont) {
        this.cont = cont;
    }

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        this.us = us;
    }

    public Usuario getUs2() {
        return us2;
    }

    public void setUs2(Usuario us2) {
        this.us2 = us2;
    }

    public int getEst() {
        return est;
    }

    public void setEst(int est) {
        this.est = est;
    }

    public void buttonAction(String asiento) {
        String as = asiento;
        System.out.println("asiento " + as);
        String est1 = "1";
        String est2 = "2";

        est = us2.getId();

        for (Fila fila : filas) {

            if (fila.getAsi_a().getId_as().equalsIgnoreCase(as)) {
                if (fila.getAsi_a().getId_usuario() == 0) {
                    fila.getAsi_a().setId_usuario(est);
                    fila.getAsi_a().setCont(est);
                }
                if (fila.getAsi_a().getEstado().equalsIgnoreCase(est1)) {
                    fila.getAsi_a().setEstado(est2);
                } else if (fila.getAsi_a().getId_usuario() == est) {
                    fila.getAsi_a().setEstado(est1);
                    fila.getAsi_a().setId_usuario(0);
                    fila.getAsi_a().setCont(0);
                }

            }

            if (fila.getAsi_b().getId_as().equalsIgnoreCase(as)) {
                if (fila.getAsi_b().getId_usuario() == 0) {
                    fila.getAsi_b().setId_usuario(est);
                    fila.getAsi_b().setCont(est);
                }
                if (fila.getAsi_b().getEstado().equalsIgnoreCase(est1)) {
                    fila.getAsi_b().setEstado(est2);
                } else if (fila.getAsi_b().getId_usuario() == est) {
                    fila.getAsi_b().setEstado(est1);
                    fila.getAsi_b().setId_usuario(0);
                    fila.getAsi_b().setCont(0);
                }

            }

            if (fila.getAsi_c().getId_as().equalsIgnoreCase(as)) {
                if (fila.getAsi_c().getId_usuario() == 0) {
                    fila.getAsi_c().setId_usuario(est);
                    fila.getAsi_c().setCont(est);
                }
                if (fila.getAsi_c().getEstado().equalsIgnoreCase(est1)) {
                    fila.getAsi_c().setEstado(est2);
                } else if (fila.getAsi_c().getId_usuario() == est) {
                    fila.getAsi_c().setEstado(est1);
                    fila.getAsi_c().setId_usuario(0);
                    fila.getAsi_c().setCont(0);
                }

            }

            if (fila.getAsi_d().getId_as().equalsIgnoreCase(as)) {
                if (fila.getAsi_d().getId_usuario() == 0) {
                    fila.getAsi_d().setId_usuario(est);
                    fila.getAsi_d().setCont(est);
                }
                if (fila.getAsi_d().getEstado().equalsIgnoreCase(est1)) {
                    fila.getAsi_d().setEstado(est2);
                } else if (fila.getAsi_d().getId_usuario() == est) {
                    fila.getAsi_d().setEstado(est1);
                    fila.getAsi_d().setId_usuario(0);
                    fila.getAsi_d().setCont(0);
                }

            }

            if (fila.getAsi_e().getId_as().equalsIgnoreCase(as)) {
                if (fila.getAsi_e().getId_usuario() == 0) {
                    fila.getAsi_e().setId_usuario(est);
                    fila.getAsi_e().setCont(est);
                }
                if (fila.getAsi_e().getEstado().equalsIgnoreCase(est1)) {
                    fila.getAsi_e().setEstado(est2);
                } else if (fila.getAsi_e().getId_usuario() == est) {
                    fila.getAsi_e().setEstado(est1);
                    fila.getAsi_e().setId_usuario(0);
                    fila.getAsi_e().setCont(0);
                }

            }

            if (fila.getAsi_f().getId_as().equalsIgnoreCase(as)) {
                if (fila.getAsi_f().getId_usuario() == 0) {
                    fila.getAsi_f().setId_usuario(est);
                    fila.getAsi_f().setCont(est);
                }
                if (fila.getAsi_f().getEstado().equalsIgnoreCase(est1)) {
                    fila.getAsi_f().setEstado(est2);
                } else if (fila.getAsi_f().getId_usuario() == est) {
                    fila.getAsi_f().setEstado(est1);
                    fila.getAsi_f().setId_usuario(0);
                    fila.getAsi_f().setCont(0);
                }

            }

            if (fila.getAsi_g().getId_as().equalsIgnoreCase(as)) {
                if (fila.getAsi_g().getId_usuario() == 0) {
                    fila.getAsi_g().setId_usuario(est);
                    fila.getAsi_g().setCont(est);
                }
                if (fila.getAsi_g().getEstado().equalsIgnoreCase(est1)) {
                    fila.getAsi_g().setEstado(est2);
                } else if (fila.getAsi_g().getId_usuario() == est) {
                    fila.getAsi_g().setEstado(est1);
                    fila.getAsi_g().setId_usuario(0);
                    fila.getAsi_g().setCont(0);
                }

            }

            if (fila.getAsi_h().getId_as().equalsIgnoreCase(as)) {
                if (fila.getAsi_h().getId_usuario() == 0) {
                    fila.getAsi_h().setId_usuario(est);
                    fila.getAsi_h().setCont(est);
                }
                if (fila.getAsi_h().getEstado().equalsIgnoreCase(est1)) {
                    fila.getAsi_h().setEstado(est2);
                } else if (fila.getAsi_h().getId_usuario() == est) {
                    fila.getAsi_h().setEstado(est1);
                    fila.getAsi_h().setId_usuario(0);
                    fila.getAsi_h().setCont(0);
                }

            }

            if (fila.getAsi_i().getId_as().equalsIgnoreCase(as)) {
                if (fila.getAsi_i().getId_usuario() == 0) {
                    fila.getAsi_i().setId_usuario(est);
                    fila.getAsi_i().setCont(est);
                }
                if (fila.getAsi_i().getEstado().equalsIgnoreCase(est1)) {
                    fila.getAsi_i().setEstado(est2);
                } else if (fila.getAsi_i().getId_usuario() == est) {
                    fila.getAsi_i().setEstado(est1);
                    fila.getAsi_i().setId_usuario(0);
                    fila.getAsi_i().setCont(0);
                }

            }

            if (fila.getAsi_j().getId_as().equalsIgnoreCase(as)) {
                if (fila.getAsi_j().getId_usuario() == 0) {
                    fila.getAsi_j().setId_usuario(est);
                    fila.getAsi_j().setCont(est);
                }
                if (fila.getAsi_j().getEstado().equalsIgnoreCase(est1)) {
                    fila.getAsi_j().setEstado(est2);
                } else if (fila.getAsi_j().getId_usuario() == est) {
                    fila.getAsi_j().setEstado(est1);
                    fila.getAsi_j().setId_usuario(0);
                    fila.getAsi_j().setCont(0);
                }

            }

        }

        for (Fila fila : filas) {
            System.out.println("asiento " + fila.getAsi_a().getId_as() + " estado " + fila.getAsi_a().getEstado());
            System.out.println("asiento " + fila.getAsi_b().getId_as() + " estado " + fila.getAsi_b().getEstado());

            System.out.println("1est " + est);
            System.out.println("1asib " + fila.getAsi_b().getId_usuario());
        }

    }

    public String mostrarSala(Usuario user) {
        us2 = new Usuario(user.getId(), user.getNombre(), user.getCiudad(), user.getDireccion());
        est = user.getId();
        System.out.println("Usuario que entra " + user.getId());
        System.out.println("Usuario us " + us2.getId());

        for (Fila fila : filas) {

            fila.getAsi_a().setCont(est);

            fila.getAsi_b().setCont(est);

            fila.getAsi_c().setCont(est);

            fila.getAsi_d().setCont(est);

            fila.getAsi_e().setCont(est);

            fila.getAsi_f().setCont(est);

            fila.getAsi_g().setCont(est);

            fila.getAsi_h().setCont(est);

            fila.getAsi_i().setCont(est);

            fila.getAsi_j().setCont(est);
        }

        return "Insertar?faces-redirect=true";
    }

    public String mstyle(Asiento asi) {
        /*  System.out.println("id "+asi.getId_as());
                        System.out.println("idus "+asi.getId_usuario());
                                    System.out.println("estado "+asi.getEstado());
          
            String band = "";
            if(asi.getId_usuario() != 0 ){
                band = "ocupado";
            }else     if(asi.getEstado().equalsIgnoreCase("1") ){
                band = "vacio";
            }else{
                band = "reservado";
            }*/

        return "ocupado";
    }

    public void addUsuario() {
        Usuario newUser = new Usuario();

        newUser.setNombre(us.getNombre());
        newUser.setCiudad(us.getCiudad());
        newUser.setDireccion(us.getDireccion());
        int tam = usuarios.size();
        int con = 0;

        if (tam == 0) {
            newUser.setId(1);
        } else {

            for (Usuario a : usuarios) {
                con = a.getId();
            }
            ++con;
            newUser.setId(con);
        }
        usuarios.add(newUser);
    }

    public void deleteUsuario(Usuario us) {
        usuarios.remove(us);

    }

}
