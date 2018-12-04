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
public class VeiculoUsado extends Veiculos {
    
    private long quilometragem;
    private String avariado;

    /**
     * @return the quilometragem
     */
    public long getQuilometragem() {
        return quilometragem;
    }

    /**
     * @param quilometragem the quilometragem to set
     */
    public void setQuilometragem(long quilometragem) {
        this.quilometragem = quilometragem;
    }

    /**
     * @return the avariado
     */
    public String getAvariado() {
        return avariado;
    }

    /**
     * @param avariado the avariado to set
     */
    public void setAvariado(String avariado) {
        this.avariado = avariado;
    }
    
}
