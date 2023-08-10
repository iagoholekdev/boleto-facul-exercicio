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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do boleto");
        double valorBoleto = scanner.nextDouble();
        System.out.println("Quanto você deseja pagar?");
        double valorPago = scanner.nextDouble();

        Boleto boleto = new Boleto();
        boleto
                .setValorBoleto(valorBoleto)
                .setValorPago(valorPago)
                .setVencido(false);
        System.out.println(boleto);

        BoletoController  boletoController = new BoletoController();
        System.out.println(boletoController.boletoController(boleto));

    }
}
