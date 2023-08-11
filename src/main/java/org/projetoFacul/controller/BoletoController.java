package org.projetoFacul.controller;
import java.util.Map;

import org.projetoFacul.validators.ValidateBoleto;
import org.projetoFacul.services.BoletoService;

public class BoletoController implements IBoletoController {
    public String boletoController(Map<String, Object> boleto){
        ValidateBoleto validator = new ValidateBoleto();
        
        if (!validator.addBoleto(boleto).validateBoleto().isEmpty()) {
          return validator.addBoleto(boleto).validateBoleto();
        }
        System.out.println("Iniciando pagamento...");
        BoletoService boletoService = new BoletoService();
        return boletoService
                        .addBoleto(boleto)
                        .createBoleto()
                        .pagar();
    }
}
