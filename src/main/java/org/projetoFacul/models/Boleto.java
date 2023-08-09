package org.projetoFacul.models;

public class Boleto {
    private double valorBoleto;
    private double valorPago;
    private boolean vencido;

    @Override
    public String toString() {
        return String.format("Status do boleto! Valor do boleto: %s, " +
                "Valor pago do boleto: %s, " +
                "o boleto está vencido? %s", valorBoleto, valorPago, vencido);
    }

    public Boleto(){
        this.vencido     = false;
        this.valorPago   = 0;
        this.valorBoleto = 0;

    }
    public double getValorBoleto() {
        return this.valorBoleto;
    }

    public double getValorPago() {
        return this.valorPago;
    }

    public boolean isVencido() {
        return this.vencido;
    }

    public Boleto setValorBoleto(double valorBoleto) {
        if (valorBoleto < 0) {
            this.valorBoleto = 0;
        } else {
            this.valorBoleto = valorBoleto;
        }
        return this;
    }

    public Boleto setValorPago(double valorPago) {
        if (valorPago < 0) {
          this.valorPago = 0;
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
