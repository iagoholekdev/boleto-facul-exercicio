package org.projetoFacul.enums;

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
