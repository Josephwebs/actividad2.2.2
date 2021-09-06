/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg2.pkg2.pkg2;

import java.util.Scanner;

/**
 *
 * @author José Alcantara
 */
public class Cliente {
    
    private String nombre ,mail ,direccion,telefono;
    private int run, dv;

    public Cliente(String nombre, String mail, String direccion, int run, int dv, String telefono) {
        this.nombre = nombre;
        this.mail = mail;
        this.direccion = direccion;
        this.run = run;
        this.dv = dv;
        this.telefono = telefono;
    }

    public Cliente() {
    }
    public void Registrarse(){
        Scanner sn = new Scanner(System.in);
        System.out.print("Ingrese su nombre : ");
        this.nombre = sn.nextLine();
        System.out.print("Ingrese su e-mail : ");
        this.mail = sn.nextLine();
        System.out.print("Ingrese su direccion : ");
        this.direccion = sn.nextLine();
        System.out.print("Ingrese su telefono : ");
        this.telefono = sn.nextLine();
        System.out.print("Ingrese su run sin digito verificador : ");
        this.run = sn.nextInt();
        System.out.print("Ingrese su digito verificador : ");
        this.dv = sn.nextInt();
        
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
        return direccion;
    }

    public void setDirección(String dirección) {
        this.direccion = dirección;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
}
