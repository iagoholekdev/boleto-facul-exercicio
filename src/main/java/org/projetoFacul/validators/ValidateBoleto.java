package org.projetoFacul.validators;
import org.projetoFacul.resources.ResourceString;

import java.util.Map;

/**
 * Classe responsável pela validação do boleto
 * @author iagoholekdev
 * @since 11/08/2023
 * @version 1.0
 */
public class ValidateBoleto implements IValidateBoleto {
    private Map<String, Object> boleto;
    public String validateBoleto(){
      double valorBoleto = ((Number)  boleto.get("valorBoleto")).doubleValue();     
      boolean vencido = (boolean) boleto.get("vencido");
      double valorPago = ((Number) boleto.get("valorPago")).doubleValue();
      System.out.println("Validando boleto...");
      if (valorBoleto <= ResourceString.getValorZero() ) {
          return ResourceString.getValidacaoValorBoleto();
        }

      if (valorPago <= ResourceString.getValorZero() ) {
        return ResourceString.getValidacaoValorPago();
      }

      if (valorPago > valorBoleto){
          return ResourceString.getValidacaoValorPagoMaior();
        }

      if (vencido) {
          return ResourceString.getValidacaoVencido();
        }
      System.out.println(ResourceString.getValidacaoSucesso());
      return ResourceString.getEmptyString();
    }

    public IValidateBoleto addBoleto(Map<String, Object> boleto) {
        this.boleto = boleto;
        return this;
    }
}
