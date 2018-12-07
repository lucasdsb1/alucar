/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author l_dsb
 */
public class ContratoAPP extends Contrato {
    
    private String tipoContrato;
    private int cod_tipoContrato;
    private String valor_contrato;
    
    public ContratoAPP() {
        
        this.cod_tipoContrato = 1;
        this.tipoContrato = "Aplicativo";

    }

    @Override
    public String desconto(double valor) {
        
        valor = valor - (valor * 0.15);
        this.valor_contrato = Double.toString(valor);
        
        return valor_contrato;
        
    }

    /**
     * @return the tipoContrato
     */
    public String getTipoContrato() {
        return tipoContrato;
    }

    /**
     * @param tipoContrato the tipoContrato to set
     */
    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    /**
     * @return the cod_tipoContrato
     */
    public int getCod_tipoContrato() {
        return cod_tipoContrato;
    }

    /**
     * @param cod_tipoContrato the cod_tipoContrato to set
     */
    public void setCod_tipoContrato(int cod_tipoContrato) {
        this.cod_tipoContrato = cod_tipoContrato;
    }

    /**
     * @return the valor_contrato
     */
    public String getValor_contrato() {
        return valor_contrato;
    }

    /**
     * @param valor_contrato the valor_contrato to set
     */
    public void setValor_contrato(String valor_contrato) {
        this.valor_contrato = valor_contrato;
    }
    
}
