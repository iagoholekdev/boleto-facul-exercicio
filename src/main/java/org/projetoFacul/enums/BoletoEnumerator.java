package org.projetoFacul.enums;


/**
 * @author iagoholekdev
 * @since 11/08/2023
 * @version 1.0
 */
public class BoletoEnumerator {
    public enum BoletoEnum {
        VALOR_BOLETO("valorBoleto"),
        VENCIDO("vencido"),
        VALOR_PAGO("valorPago");

        private String value;

        BoletoEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    
}
