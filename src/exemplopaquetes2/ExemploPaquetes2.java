/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplopaquetes2;

import com.pablo.taller.Taller;
import com.pablo.ventas.Ventas;

/**
 *
 * @author pnocedalopez
 */
public class ExemploPaquetes2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Coches coche1 = new Coches("1111");
        Ventas venta1 = new Ventas(coche1, 134, "Renault");
        Taller factura1 = new Taller(coche1, 134.5f);

        factura1.cobrar(venta1.getCoche());

        System.out.println(venta1.toString());
        System.out.println(factura1.toString());
    }

}
