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
public class Solicitud {
    private String  fecha, cliente,productos; 
    private int número, total;

    public Solicitud(String fecha, String cliente, String productos, int número, int total) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.productos = productos;
        this.número = número;
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public int getNúmero() {
        return número;
    }

    public void setNúmero(int número) {
        this.número = número;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
}
