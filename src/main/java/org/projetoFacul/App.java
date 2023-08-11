package org.projetoFacul;

import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;
import org.projetoFacul.controller.BoletoController;
import org.projetoFacul.enums.BoletoEnumerator.BoletoEnum;
import org.projetoFacul.resources.ResourceString;
/**
 * @author iagoholekdev
 * @since 11/87/2023
 * @version 1.0
 * Classe main para execução do programa
 */
public class App 
{
    /*
     * Método principal.
     */
    public static void main( String[] args )
    {
        try {
          Scanner scanner = new Scanner(System.in);

          System.out.println(ResourceString.getDigiteOValorBoleto());
          double valorBoleto = scanner.nextDouble();
          System.out.println(ResourceString.getPerguntaInicialBoleto());
          double valorPago = scanner.nextDouble();    

          Map<String, Object> boletoInfo = alimentaBoleto(valorPago, valorBoleto);   
          showBoletoInfo(boletoInfo); 

          System.out.println(ResourceString.getInitBoleto());
          
          BoletoController boletoController = new BoletoController();
          System.out.println(boletoController.boletoController(boletoInfo));

          scanner.close();   
        } catch (Exception e) {
           System.out.println(ResourceString.getDefaultExceptMensagem() + e.getMessage());
        }
    }

    /**
     * Método para alimentar o boleto
     * @param valor
     * @param valorBoleto
     * @return Map<String, Object>
     */
    public static Map<String, Object> alimentaBoleto(double valor, double valorBoleto) {
        Map<String, Object> boletoInfo = new HashMap<>();
        boletoInfo.put(BoletoEnum.VALOR_BOLETO.getValue(), valorBoleto);
        boletoInfo.put(BoletoEnum.VALOR_PAGO.getValue(), valor);
        boletoInfo.put(BoletoEnum.VENCIDO.getValue(), false);
        return boletoInfo;
    }

    /**
     * Método para mostrar informações do boleto
     * @param boleto
     */
    public static void showBoletoInfo(Map<String, Object> boleto) {
        boolean valorVencido = (boolean) boleto.get("vencido");      
        String vencidoString = valorVencido ? "Sim" : "Não";
        System.out.println("Valor do boleto: " + boleto.get("valorBoleto") + "\n" +
                           "Valor pago: " + boleto.get("valorPago") + "\n" +
                           "Vencido: " + vencidoString);    

    }

}
