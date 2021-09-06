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
public class Actividad222 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        
        boolean salir = false;
        int opcion;
        int numeroSoli = 0;
        while(!salir){
            
            System.out.println("1. Registrarse");
            System.out.println("2. Hacer pedido");
            System.out.println("3. ver detalle de pedido");
            System.out.println("4. obtener numero de solicitud");
            System.out.println("5. Salir");
            
            System.out.println("introduce un numero: ");
            opcion = sn.nextInt();
            
            switch (opcion) {
                case 1:
                    Cliente nuevoCliente = new Cliente();
                    System.out.println("------------------------");
                    System.out.println("REGISTRARSE");
                    System.out.println("------------------------");
                    nuevoCliente.Registrarse();
                    break;
                case 2:
                    System.out.println("------------------------");
                    System.out.println("AGREGAR PRODUCTOS A LA SOLICITUD");     
                    System.out.println("------------------------");
                    Producto zanahoria = new Producto("verdura","Zanahoria",1000, 890, "1000 gramos");
                    break;
                case 3:
                    System.out.println("------------------------");
                    System.out.println("VER DETALLE DE PEDIDO");     
                    System.out.println("------------------------");
                    break;
                case 4:
                    numeroSoli = numeroSoli + 1;
                    System.out.println("------------------------");
                    System.out.println("OBTENER NUMERO DE SOLICITUD");     
                    System.out.println("------------------------");
                    System.out.println("Tu numero de solicitud es " + numeroSoli);
                    System.out.println("------------------------------------------");
                    break;              
                case 5:
                    System.out.println("------------------------");
                    System.out.println("GRACIAS, VUELVA PRONTO");     
                    System.out.println("------------------------");
                    salir = true;
                    break;
            } 
                     
        }
    }
}
    
