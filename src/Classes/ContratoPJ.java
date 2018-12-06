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
public class ContratoPJ extends Contrato{
 
    private String CNPJCli;
    private String tipoContrato;

    @Override
    public String desconto(double valor) {
        
        valor = valor - (valor * 0.1);
        String valorComDesconto =  "10%: " + valor;
        
        return valorComDesconto;
        
    }

    /**
     * @return the CNPJCli
     */
    public String getCNPJCli() {
        return CNPJCli;
    }

    /**
     * @param CNPJCli the CNPJCli to set
     */
    public void setCNPJCli(String CNPJCli) {
        this.CNPJCli = CNPJCli;
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
