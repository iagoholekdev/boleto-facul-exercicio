package org.projetoFacul.models;

import org.projetoFacul.resources.ResourceString;

/**
 * Boleto
 * @author iagoholekdev
 * @since 11/08/2023
 * @version 1.0
 */
 
public class Boleto {
    private double valorBoleto;
    private double valorPago;
    private boolean vencido;

    @Override
    public String toString() {
        return String.format(ResourceString.getStatusBoleto(), valorBoleto, valorPago, vencido);
    }

    public Boleto(){
        this.vencido     = false;
        this.valorPago   = ResourceString.getValorZero();
        this.valorBoleto = ResourceString.getValorZero();

    }
    public double getValorBoleto() {
        return this.valorBoleto;
    }

    public double getValorPago() {
        return this.valorPago;
    }

    public boolean getVencido() {
        return this.vencido;
    }

    public Boleto setValorBoleto(double valorBoleto) {
        if (valorBoleto < ResourceString.getValorZero()) {
            this.valorBoleto = ResourceString.getValorZero();
        } else {
            this.valorBoleto = valorBoleto;
        }
        return this;
    }

    public Boleto setValorPago(double valorPago) {
        if (valorPago < ResourceString.getValorZero()) {
          this.valorPago = ResourceString.getValorZero();
        } else {
          this.valorPago = valorPago;
        }
        return this;
    }

    public Boleto setVencido(boolean vencido) {
        this.vencido = vencido;
        return this;
    }


}
