/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import model.observer.*;

/**
 *
 * @author lucas
 */
public class Barreira implements TiroListener{
    
    ArrayList barreira = new ArrayList();

    /**
     *
     * @param e
     */
    @Override
    public void moveu(TiroEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
