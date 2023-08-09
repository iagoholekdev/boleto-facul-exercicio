package org.projetoFacul.services;
import org.projetoFacul.services.IBoletoService;
import org.projetoFacul.models.Boleto;

public class BoletoService implements IBoletoService{
    private Boleto boleto;
    public IBoletoService addBoleto(Boleto boleto) {
        this.boleto = boleto;
        return this;

    }

    public void createBoleto() {

    }
}
