package org.projetoFacul.controller;
import java.util.Map;

import org.projetoFacul.validators.ValidateBoleto;
import org.projetoFacul.services.BoletoService;
import org.projetoFacul.resources.ResourceString;
/**
 * Classe controller, aqui ficará responsável pelo controle de chamada dos métodos de validação e pagamento do boleto.
 * @author iagoholekdev
 * @since 11/08/2023
 * @version 1.0
 */
 
public class BoletoController implements IBoletoController {
    public String boletoController(Map<String, Object> boleto){
        ValidateBoleto validator = new ValidateBoleto();
        
        if (!validator.addBoleto(boleto).validateBoleto().isEmpty()) {
          return validator.addBoleto(boleto).validateBoleto();
        }
        System.out.println(ResourceString.getInciandoPagamento());
        BoletoService boletoService = new BoletoService();
        return boletoService
                        .addBoleto(boleto)
                        .createBoleto()
                        .pagar();
    }
}
