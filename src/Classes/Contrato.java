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
public abstract class Contrato{
    
    private int codContrato;
    private String placaVei;
    private String qtdDiasContrato;
    private double valorContrato;
    private String CPFouCNPJCli;
    private String dataFimContrato;
    
    public abstract String desconto(double valor);
    
    public String valorContrato(String modelo) {
        
        int valorContratado;
        String valorFinal = null;
        
        if (modelo.equals("Palio")) {

            valorContratado = 100 * (Integer.parseInt(this.getQtdDiasContrato()));
            valorFinal = "" + valorContratado;
            

        } else if (modelo.equals("Sandero")) {

            valorContratado = 115 * (Integer.parseInt(this.getQtdDiasContrato()));
            valorFinal = "" + valorContratado;

        } else if (modelo.equals("Uno")) {

            valorContratado = 85 * (Integer.parseInt(this.getQtdDiasContrato()));
            valorFinal = "" + valorContratado;

        } else if (modelo.equals("Argo")) {

            valorContratado = 125 * (Integer.parseInt(this.getQtdDiasContrato()));
            valorFinal = "" + valorContratado;

        } else if (modelo.equals("Onix")) {

            valorContratado = 115 * (Integer.parseInt(this.getQtdDiasContrato()));
            valorFinal = "" + valorContratado;

        } else if (modelo.equals("Virtus")) {

            valorContratado = 130 * (Integer.parseInt(this.getQtdDiasContrato()));
            valorFinal = "" + valorContratado;

        } else if (modelo.equals("Gol")) {

            valorContratado = 100 * (Integer.parseInt(this.getQtdDiasContrato()));
            valorFinal = "" + valorContratado;

        } else if (modelo.equals("Fluence")) {

            valorContratado = 150 * (Integer.parseInt(this.getQtdDiasContrato()));
            valorFinal = "" + valorContratado;

        } else if (modelo.equals("Captur")) {

            valorContratado = 150 * (Integer.parseInt(this.getQtdDiasContrato()));
            valorFinal = "" + valorContratado;

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
     * @return the valorContrato
     */
    public double getValorContrato() {
        return valorContrato;
    }

    /**
     * @param valorContrato the valorContrato to set
     */
    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
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
   
}
