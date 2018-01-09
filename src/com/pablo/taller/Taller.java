/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablo.taller;

import exemplopaquetes2.Coches;

/**
 *
 * @author pnocedalopez
 */
public class Taller {

    private Coches matricula;
    private float factura;

    public Taller(Coches matricula, float factura) {
        this.matricula = matricula;
        this.factura = factura;
    }

    public Taller() {

    }

    public Coches getMatricula() {
        return matricula;
    }

    public void setMatricula(Coches matricula) {
        this.matricula = matricula;
    }

    public float getFactura() {
        return factura;
    }

    public void setFactura(float factura) {
        this.factura = factura;
    }

    public void cobrar(Coches coche) {

        if (coche.getMatricula() == this.matricula.getMatricula()) {

            factura = factura - (factura * 20 / 100);

        } else {
        }
    }

    @Override
    public String toString() {
        return "Taller { " + matricula + ", Factura: " + factura + " }";
    }

}
