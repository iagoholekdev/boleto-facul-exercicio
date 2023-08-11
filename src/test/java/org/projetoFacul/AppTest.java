package org.projetoFacul;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.projetoFacul.models.Boleto;
import org.projetoFacul.controller.BoletoController;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    String makeTest(Boleto boleto, double valor, double valorBoleto, boolean vencido){

        boleto
                .setValorBoleto(valorBoleto)
                .setValorPago(valor)
                .setVencido(vencido);
        BoletoController boletoController = new BoletoController();
        return (boletoController.boletoController(boleto));
    }
    public void testMain() {
        Boleto boleto = new Boleto();
        Assert.assertEquals( "Valor do boleto é invalido!", makeTest(boleto,100, -100, true));
        Assert.assertEquals( "Valor do boleto é invalido!", makeTest(boleto,100, 0, true) );
        Assert.assertEquals("Valor pago é inválido!", makeTest(boleto,0, 100, true));
        Assert.assertEquals("Valor pago é maior que o valor do boleto!", makeTest(boleto,200, 100, true) );
        Assert.assertEquals("Boleto já passou da data de pagamento!", makeTest(boleto,100, 100, true));
        Assert.assertEquals("Boleto quitado, você pagou o valor total!", makeTest(boleto,100, 100, false));
        Assert.assertEquals("Boleto pago parcialmente, valor restante 50.00", makeTest(boleto,50, 100, false));

    }

    public void testAlimentaBoleto() {
        Boleto boleto = new Boleto();
        boleto
            .setValorBoleto(100)
            .setValorPago(50)
            .setVencido(true);
        Assert.assertTrue(boleto.getVencido());
        Assert.assertEquals(100.00, boleto.getValorBoleto());
        Assert.assertEquals(50.00, boleto.getValorPago());
    }
}
