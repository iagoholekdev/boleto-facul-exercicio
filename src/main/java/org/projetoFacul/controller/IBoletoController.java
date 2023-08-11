package org.projetoFacul.controller;
import java.util.Map;


/**
 * @author iagoholekdev
 * @since 11/08/2023
 * @version 1.0
 * Interface controller, aqui ficará responsável pelo controle de chamada dos métodos de validação e pagamento do boleto.
 */
public interface IBoletoController {
    String boletoController(Map<String, Object> boleto);
}
