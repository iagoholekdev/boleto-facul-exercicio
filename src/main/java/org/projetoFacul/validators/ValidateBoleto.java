package org.projetoFacul.validators;

import java.util.Map;


public class ValidateBoleto implements IValidateBoleto {
    private Map<String, Object> boleto;
    public String validateBoleto(){
      double valorBoleto = ((Number)  boleto.get("valorBoleto")).doubleValue();     
      boolean vencido = (boolean) boleto.get("vencido");
      double valorPago = ((Number) boleto.get("valorPago")).doubleValue();
      
      if (valorBoleto <= 0 ) {
          return "Valor do boleto é invalido!";
        }

      if (valorPago <= 0 ) {
            return "Valor pago é inválido!";
        }

      if (valorPago > valorBoleto){
          return "Valor pago é maior que o valor do boleto!";
        }

      if (vencido) {
          return "Boleto já passou da data de pagamento!";
        }

      return "";
    }

    public IValidateBoleto addBoleto(Map<String, Object> boleto) {
        this.boleto = boleto;
        return this;
    }
}
