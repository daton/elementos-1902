/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author campitos
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Orden {
    private String comida;
    private String bebida;

    public Orden() {
    }
    

    /**
     * @return the comida
     */
    public String getComida() {
        return comida;
    }

    /**
     * @param comida the comida to set
     */
    public void setComida(String comida) {
        this.comida = comida;
    }

    /**
     * @return the bebida
     */
    public String getBebida() {
        return bebida;
    }

    /**
     * @param bebida the bebida to set
     */
    public void setBebida(String bebida) {
        this.bebida = bebida;
    }
}
