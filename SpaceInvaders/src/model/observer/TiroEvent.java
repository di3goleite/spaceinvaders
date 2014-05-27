/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.observer;

import java.util.EventObject;

/**
 *
 * @author lucas
 */
public class TiroEvent extends EventObject{

    /**
     *
     * @param source
     */
    public TiroEvent(Object source) {
        super(source);
    }
    
}
