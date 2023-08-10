package org.projetoFacul.services;
import org.projetoFacul.services.IBoletoService;
import org.projetoFacul.models.Boleto;

public class BoletoService implements IBoletoService{
    private Boleto boleto;
    public IBoletoService addBoleto(Boleto boleto) {
        this.boleto = boleto;
        return this;

    }

    public String createBoleto() {
      double value = boleto.getValorBoleto() - boleto.getValorPago();
      if (value == 0) {
        return "Boleto quitado, você pagou o valor total!";
      }
      return String.format("Boleto pago parcialmente, valor restante %.2f", value);


    }
}
