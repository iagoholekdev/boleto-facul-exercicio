package org.projetoFacul;
import org.projetoFacul.models.Boleto;
import java.util.Scanner;
import org.projetoFacul.controller.BoletoController;

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

        Boleto boleto = alimentaBoleto(valorPago, valorBoleto);
        System.out.println(boleto);

        BoletoController boletoController = new BoletoController();
        System.out.println(boletoController.boletoController(boleto));
        } catch (Exception e) {
           System.out.println("Ocorreu um erro! Motivo: " + e.getMessage());
        }
    }

    public static Boleto alimentaBoleto(double valor, double valorBoleto) {
        Boleto boleto = new Boleto();
        return boleto
                .setValorBoleto(valorBoleto)
                .setValorPago(valor)
                .setVencido(false);
    }

}
