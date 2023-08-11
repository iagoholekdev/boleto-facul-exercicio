package org.projetoFacul;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.projetoFacul.models.Boleto;
import static org.mockito.Mockito.*;


import java.util.HashMap;
import java.util.Map;


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

    String makeTest(double valor, double valorBoleto, boolean vencido){
        Map<String, Object> boleto = new HashMap<>();  
        boleto.put("valorBoleto", valorBoleto);
        boleto.put("valorPago", valor);
        boleto.put("vencido", vencido);
        BoletoController boletoController = new BoletoController();
        return (boletoController.boletoController(boleto));
    }
    public void testMain() {        
        Assert.assertEquals( "Valor do boleto é invalido!", makeTest(100, -100, true));
        Assert.assertEquals( "Valor do boleto é invalido!", makeTest(100, 0, true) );
        Assert.assertEquals("Valor pago é inválido!", makeTest(0, 100, true));
        Assert.assertEquals("Valor pago é maior que o valor do boleto!", makeTest(200, 100, true) );
        Assert.assertEquals("Boleto já passou da data de pagamento!", makeTest(100, 100, true));
        Assert.assertEquals("Boleto quitado, você pagou o valor total!", makeTest(100, 100, false));
        Assert.assertEquals("Boleto pago parcialmente, valor restante 50,00", makeTest(50, 100, false));

    }

    public void testAlimentaBoleto() {
        Boleto boletoMock = mock(Boleto.class);
        when(boletoMock.getValorBoleto()).thenReturn(100.0);
        when(boletoMock.getValorPago()).thenReturn(50.0);
        when(boletoMock.getVencido()).thenReturn(true);

        Assert.assertTrue(boletoMock.getVencido());
        Assert.assertEquals(100.0, boletoMock.getValorBoleto());
        Assert.assertEquals(50.0, boletoMock.getValorPago());

        when(boletoMock.getValorBoleto()).thenReturn(-100.0);
        when(boletoMock.getValorPago()).thenReturn(0.0);
        when(boletoMock.getVencido()).thenReturn(false);

        Assert.assertTrue(!boletoMock.getVencido());
        Assert.assertEquals(-100.0, boletoMock.getValorBoleto());
        Assert.assertEquals(0.0, boletoMock.getValorPago());
    }


}
