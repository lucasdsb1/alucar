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
public class ContratoPF extends Contrato{
    
    private String CPFCli;
    private String tipoContrato;

    @Override
    public String desconto(double valor) {
        
        valor = valor - (valor * 0.05);
        String valorComDesconto =  "5%: " + valor;
        
        return valorComDesconto;
        
    }

    /**
     * @return the CPFCli
     */
    public String getCPFCli() {
        return CPFCli;
    }

    /**
     * @param CPFCli the CPFCli to set
     */
    public void setCPFCli(String CPFCli) {
        this.CPFCli = CPFCli;
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
    
}

