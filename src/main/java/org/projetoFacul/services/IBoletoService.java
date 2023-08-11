package org.projetoFacul.services;
import java.util.Map;

public interface IBoletoService {
    IBoletoService addBoleto(Map<String, Object> boleto);
    IBoletoService createBoleto();
    String pagar();
}
