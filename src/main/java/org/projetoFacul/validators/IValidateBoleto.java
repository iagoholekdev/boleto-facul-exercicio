package org.projetoFacul.validators;
import java.util.Map;

public interface IValidateBoleto {
    String validateBoleto();
    IValidateBoleto addBoleto(Map<String, Object> boleto);
}
