/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg2.pkg2.pkg2;

/**
 *
 * @author José Alcantara
 */
public class Cliente {
    
    private String nombre ,mail ,dirección;
    private int run, dv ,teléfono;

    public Cliente(String nombre, String mail, String dirección, int run, int dv, int teléfono) {
        this.nombre = nombre;
        this.mail = mail;
        this.dirección = dirección;
        this.run = run;
        this.dv = dv;
        this.teléfono = teléfono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getDv() {
        return dv;
    }

    public void setDv(int dv) {
        this.dv = dv;
    }

    public int getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }
    
}
