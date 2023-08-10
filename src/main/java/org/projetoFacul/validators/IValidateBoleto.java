package org.projetoFacul.validators;
import org.projetoFacul.models.Boleto;

public interface IValidateBoleto {
    String validateBoleto();
    IValidateBoleto addBoleto(Boleto boleto);
}
