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
    private int codAPP;
    private String tipoAPP;
    private String CPFouCNPJCli;

    @Override
    public String desconto(double valor) {
        
        valor = valor - (valor * 0.15);
        String valorComDesconto =  "15%: " + valor;
        
        return valorComDesconto;
        
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
     * @return the codAPP
     */
    public int getCodAPP() {
        return codAPP;
    }

    /**
     * @param codAPP the codAPP to set
     */
    public void setCodAPP(int codAPP) {
        this.codAPP = codAPP;
    }

    /**
     * @return the tipoAPP
     */
    public String getTipoAPP() {
        return tipoAPP;
    }

    /**
     * @param tipoAPP the tipoAPP to set
     */
    public void setTipoAPP(String tipoAPP) {
        this.tipoAPP = tipoAPP;
    }

    /**
     * @return the CPFouCNPJCli
     */
    public String getCPFouCNPJCli() {
        return CPFouCNPJCli;
    }

    /**
     * @param CPFouCNPJCli the CPFouCNPJCli to set
     */
    public void setCPFouCNPJCli(String CPFouCNPJCli) {
        this.CPFouCNPJCli = CPFouCNPJCli;
    }
    
}
