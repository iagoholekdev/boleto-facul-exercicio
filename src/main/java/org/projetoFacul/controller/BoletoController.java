package org.projetoFacul.controller;
import org.projetoFacul.models.Boleto;
import org.projetoFacul.validators.ValidateBoleto;
import org.projetoFacul.services.BoletoService;

public class BoletoController {
    public String boletoController(Boleto boleto){
        ValidateBoleto validator = new ValidateBoleto();
        if (!validator.addBoleto(boleto).validateBoleto().isEmpty()) {
          return validator.addBoleto(boleto).validateBoleto();
        }

        BoletoService boletoService = new BoletoService();
        return boletoService.addBoleto(boleto).createBoleto();
    }
}
