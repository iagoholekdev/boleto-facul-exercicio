package org.projetoFacul.services;
import java.util.Map;

/**
 * Interface service, aqui ficará responsável pelo controle de chamada dos métodos de validação e pagamento do boleto.
 * @author iagoholekdev
 * @since 11/08/2023
 * @version 1.0
 */

public interface IBoletoService {
    IBoletoService addBoleto(Map<String, Object> boleto);
    IBoletoService createBoleto();
    String pagar();
}
