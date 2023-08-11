package org.projetoFacul.resources;

public class ResourceString {
    private static final String validacaoValorBoleto = "Valor do boleto é invalido!";
    private static final String validacaoValorPago = "Valor pago é inválido!";
    private static final String validacaoValorPagoMaior = "Valor pago é maior que o valor do boleto!";  
    private static final String validacaoVencido = "Boleto já passou da data de pagamento!";
    private static final String validacaoSucesso = "Dados válidados!";
    private static final String emptyString = "";
    private static final String inciandoPagamento = "Iniciando pagamento...";
    private static final String criandoBoleto = "Criando boleto...";
    private static final String statusBoleto = "Status do boleto! Valor do boleto: %s, " +
                                                        "Valor pago do boleto: %s, " +
                                                        "o boleto está vencido? %s";
    
    private static final Double valorZero = 0.0;                                    
    
    private static final String digiteOValorBoleto = "Digite o valor do boleto";
    private static final String initBoleto = "Iniciando validação do boleto...";
    private static final String perguntaInicialBoleto = "Quanto você deseja pagar?";
    private static final String defaultExceptMensagem = "Ocorreu um erro! Motivo: ";
    private static final String iniciandoPagamento = "Iniciando o pagamento!";
    private static final String boletoQuitado =  "Boleto quitado, você pagou o valor total!";
    
    private static final String boletoPagoParcialmente = "Boleto pago parcialmente, valor restante %.2f";
   
    public static String getValidacaoValorBoleto() {
        return validacaoValorBoleto;
    }

    public static String getValidacaoValorPago() {
        return validacaoValorPago;
    }

    public static String getValidacaoValorPagoMaior() {
        return validacaoValorPagoMaior;
    }

    public static String getValidacaoVencido() {
        return validacaoVencido;
    }

    public static String getValidacaoSucesso() {
        return validacaoSucesso;
    }

    public static String getEmptyString() {
        return emptyString;
    }

    public static String getInciandoPagamento() {
        return inciandoPagamento;
    }

    public static String getCriandoBoleto() {
        return criandoBoleto;
    }

    public static String getStatusBoleto() {
        return statusBoleto;
    }
    
    public static Double getValorZero() {
        return valorZero;
    }

    public static String getDigiteOValorBoleto() {
        return digiteOValorBoleto;
    }

    public static String getInitBoleto() {
        return initBoleto;
    }

    public static String getPerguntaInicialBoleto() {
        return perguntaInicialBoleto;
    }
    
    public static String getDefaultExceptMensagem() {
        return defaultExceptMensagem;
    }

    public static String getIniciandoPagamento() {
        return iniciandoPagamento;
    }

    public static String getBoletoQuitado() {
        return boletoQuitado;
    }

    public static String getBoletoPagoParcialmente() {
        return boletoPagoParcialmente;
    }
    
}
