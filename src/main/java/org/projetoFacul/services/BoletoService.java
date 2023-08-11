package org.projetoFacul.services;
import java.util.Map;

import org.projetoFacul.models.Boleto;
import org.projetoFacul.resources.ResourceString;
/**
 * Classe service, responsável por criar o boleto e realizar o pagamento do mesmo.
 * @author iagoholekdev
 * @since 11/08/2023
 * @version 1.0
 */
public class BoletoService implements IBoletoService{
    private Map<String, Object> boleto;
    private Boleto boletoModel;
    public IBoletoService addBoleto(Map<String, Object> boleto) {
        this.boleto = boleto;
        return this;
    }
    public IBoletoService createBoleto() {    
        System.out.println(ResourceString.getCriandoBoleto());
        Boleto boleto = new Boleto();
        boleto
              .setValorBoleto((double) this.boleto.get("valorBoleto"))
              .setVencido((boolean) this.boleto.get("vencido"))
              .setValorPago((double) this.boleto.get("valorPago"));
        this.boletoModel = boleto;
        return this;
    }

    public String pagar() {
      System.out.println(ResourceString.getIniciandoPagamento());
      double value = boletoModel.getValorBoleto() - boletoModel.getValorPago();
      if (value == ResourceString.getValorZero()) {
        return ResourceString.getBoletoQuitado();
      }
      return String.format(ResourceString.getBoletoPagoParcialmente(), value);


    }
}
