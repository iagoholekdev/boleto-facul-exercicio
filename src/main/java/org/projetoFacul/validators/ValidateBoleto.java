package org.projetoFacul.validators;

import java.util.Map;


public class ValidateBoleto implements IValidateBoleto {
    private Map<String, Object> boleto;
    public String validateBoleto(){
      Object valorObjeto = boleto.get("valorBoleto");
      double valorBoleto = ((Number) valorObjeto).doubleValue();
      Object vencidoObjeto = boleto.get("vencido");
      boolean vencido = (boolean) vencidoObjeto;
      Object valorPagoObjeto = boleto.get("valorPago");
      double valorPago = ((Number) valorPagoObjeto).doubleValue();
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
