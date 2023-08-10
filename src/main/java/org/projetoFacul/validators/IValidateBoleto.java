package org.projetoFacul.validators;
import org.projetoFacul.models.Boleto;

public interface IValidateBoleto {
    public String validateBoleto();
    public IValidateBoleto addBoleto(Boleto boleto);
}
