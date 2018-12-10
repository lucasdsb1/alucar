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
public class Contrato implements DescontoContrato {
    
    private int codContrato;
    private String placaVei;
    private String qtdDiasContrato;
    private String CPFouCNPJCli;
    private String dataFimContrato;
    private String tipoContrato;
    private int cod_tipoContrato;
    private String valor_contrato;
    
    public Contrato() {
        
        this.cod_tipoContrato = 2;
        this.tipoContrato = "Pessoa Física";

    }
    
    @Override
    public String desconto(double valor) {
        
        valor = valor - (valor * 0.05);
        this.valor_contrato = Double.toString(valor);
        
        return valor_contrato;
        
    }
    
    public String valorContrato(String modelo) {
        
        int valorContratado;
        String valorFinal = null;
        
        switch (modelo) {
            case "Palio":
                valorContratado = 100 * (Integer.parseInt(this.getQtdDiasContrato()));
                valorFinal = "" + valorContratado;
                break;
            case "Sandero":
                valorContratado = 115 * (Integer.parseInt(this.getQtdDiasContrato()));
                valorFinal = "" + valorContratado;
                break;
            case "Uno":
                valorContratado = 85 * (Integer.parseInt(this.getQtdDiasContrato()));
                valorFinal = "" + valorContratado;
                break;
            case "Argo":
                valorContratado = 125 * (Integer.parseInt(this.getQtdDiasContrato()));
                valorFinal = "" + valorContratado;
                break;
            case "Onix":
                valorContratado = 115 * (Integer.parseInt(this.getQtdDiasContrato()));
                valorFinal = "" + valorContratado;
                break;
            case "Virtus":
                valorContratado = 130 * (Integer.parseInt(this.getQtdDiasContrato()));
                valorFinal = "" + valorContratado;
                break;
            case "Gol":
                valorContratado = 100 * (Integer.parseInt(this.getQtdDiasContrato()));
                valorFinal = "" + valorContratado;
                break;
            case "Fluence":
                valorContratado = 150 * (Integer.parseInt(this.getQtdDiasContrato()));
                valorFinal = "" + valorContratado;
                break;
            case "Captur":
                valorContratado = 150 * (Integer.parseInt(this.getQtdDiasContrato()));
                valorFinal = "" + valorContratado;
                break;
            default:
                break;
        }
        
        return valorFinal;
        
    }

    /**
     * @return the codContrato
     */
    public int getCodContrato() {
        return codContrato;
    }

    /**
     * @param codContrato the codContrato to set
     */
    public void setCodContrato(int codContrato) {
        this.codContrato = codContrato;
    }

    /**
     * @return the placaVei
     */
    public String getPlacaVei() {
        return placaVei;
    }

    /**
     * @param placaVei the placaVei to set
     */
    public void setPlacaVei(String placaVei) {
        this.placaVei = placaVei;
    }

    /**
     * @return the qtdDiasContrato
     */
    public String getQtdDiasContrato() {
        return qtdDiasContrato;
    }

    /**
     * @param qtdDiasContrato the qtdDiasContrato to set
     */
    public void setQtdDiasContrato(String qtdDiasContrato) {
        this.qtdDiasContrato = qtdDiasContrato;
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

    /**
     * @return the dataFimContrato
     */
    public String getDataFimContrato() {
        return dataFimContrato;
    }

    /**
     * @param dataFimContrato the dataFimContrato to set
     */
    public void setDataFimContrato(String dataFimContrato) {
        this.dataFimContrato = dataFimContrato;
    }

    /**
     * @return the tipoContrato
     */
    public String getTipoContrato() {
        return tipoContrato;
    }

    /**
     * @return the cod_tipoContrato
     */
    public int getCod_tipoContrato() {
        return cod_tipoContrato;
    }

    /**
     * @return the valor_contrato
     */
    public String getValor_contrato() {
        return valor_contrato;
    }

    /**
     * @param tipoContrato the tipoContrato to set
     */
    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    /**
     * @param cod_tipoContrato the cod_tipoContrato to set
     */
    public void setCod_tipoContrato(int cod_tipoContrato) {
        this.cod_tipoContrato = cod_tipoContrato;
    }

    /**
     * @param valor_contrato the valor_contrato to set
     */
    public void setValor_contrato(String valor_contrato) {
        this.valor_contrato = valor_contrato;
    }
   
}
