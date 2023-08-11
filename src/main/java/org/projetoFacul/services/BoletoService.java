package org.projetoFacul.services;
import java.util.Map;

import org.projetoFacul.models.Boleto;

public class BoletoService implements IBoletoService{
    private Map<String, Object> boleto;
    private Boleto boletoModel;
    public IBoletoService addBoleto(Map<String, Object> boleto) {
        this.boleto = boleto;
        return this;
    }
    public IBoletoService createBoleto() {    
        System.out.println("Criando o boleto...");
        Boleto boleto = new Boleto();
        boleto
              .setValorBoleto((double) this.boleto.get("valorBoleto"))
              .setVencido((boolean) this.boleto.get("vencido"))
              .setValorPago((double) this.boleto.get("valorPago"));
        this.boletoModel = boleto;
        return this;
    }

    public String pagar() {
      System.out.println("Iniciando o pagamento!");
      double value = boletoModel.getValorBoleto() - boletoModel.getValorPago();
      if (value == 0) {
        return "Boleto quitado, você pagou o valor total!";
      }
      return String.format("Boleto pago parcialmente, valor restante %.2f", value);


    }
}
