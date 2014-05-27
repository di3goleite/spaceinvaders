/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.observer;

import java.util.EventListener;

/**
 *
 * @author lucas
 */
public interface BarreiraListener extends EventListener{

    /**
     *
     * @param be
     */
    void foiDestruida(BarreiraEvent be);

    /**
     *
     * @param be
     */
    void foiAtingida(BarreiraEvent be);
}
