package org.projetoFacul;
import org.projetoFacul.models.Boleto;
import java.util.Scanner;

/**
 * @author iagoholekdev
 * Classe main para execução do programa
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        double valorBoleto = scanner.nextDouble();

        Boleto boleto = new Boleto();
        boleto.setValorBoleto(0)
                .setValorPago(0)
                .setVencido(false);
        System.out.println(boleto);
    }
}
