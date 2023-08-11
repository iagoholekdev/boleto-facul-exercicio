package org.projetoFacul.validators;

import org.projetoFacul.models.Boleto;

public class ValidateBoleto implements IValidateBoleto {
    private Boleto boleto;
    public String validateBoleto(){
        if (boleto.getValorBoleto() <= 0 ) {
          return "Valor do boleto é invalido!";
        }


        if (boleto.getValorPago() <= 0 ) {
            return "Valor pago é inválido!";
        }

        if (boleto.getValorPago() > boleto.getValorBoleto()){
          return "Valor pago é maior que o valor do boleto!";
        }

        if (boleto.getVencido()) {
          return "Boleto já passou da data de pagamento!";
        }

        return "";
    }

    public IValidateBoleto addBoleto(Boleto boleto) {
        this.boleto = boleto;
        return this;
    }
}
