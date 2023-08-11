package org.projetoFacul;

import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;
import org.projetoFacul.controller.BoletoController;
import org.projetoFacul.enums.BoletoEnumerator.BoletoEnum;
/**
 * @author iagoholekdev
 * Classe main para execução do programa
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Digite o valor do boleto");
          double valorBoleto = scanner.nextDouble();
          System.out.println("Quanto você deseja pagar?");
          double valorPago = scanner.nextDouble();    

          Map<String, Object> boletoInfo = alimentaBoleto(valorPago, valorBoleto);   
          showBoletoInfo(boletoInfo); 

          System.out.println("Iniciando validação do boleto...");
          
          BoletoController boletoController = new BoletoController();
          System.out.println(boletoController.boletoController(boletoInfo));

          scanner.close();   
        } catch (Exception e) {
           System.out.println("Ocorreu um erro! Motivo: " + e.getMessage());
        }
    }

    public static Map<String, Object> alimentaBoleto(double valor, double valorBoleto) {
        Map<String, Object> boletoInfo = new HashMap<>();
        boletoInfo.put(BoletoEnum.VALOR_BOLETO.getValue(), valorBoleto);
        boletoInfo.put(BoletoEnum.VALOR_PAGO.getValue(), valor);
        boletoInfo.put(BoletoEnum.VENCIDO.getValue(), false);
        return boletoInfo;
    }

    public static void showBoletoInfo(Map<String, Object> boleto) {
        boolean valorVencido = (boolean) boleto.get("vencido");      
        String vencidoString = valorVencido ? "Sim" : "Não";
        System.out.println("Valor do boleto: " + boleto.get("valorBoleto") + "\n" +
                           "Valor pago: " + boleto.get("valorPago") + "\n" +
                           "Vencido: " + vencidoString);    

    }

}
