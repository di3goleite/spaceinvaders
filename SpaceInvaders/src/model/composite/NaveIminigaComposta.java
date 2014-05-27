/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.composite;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author lucas
 */
public class NaveIminigaComposta implements INaveInimiga{
    ArrayList<INaveInimiga> aliens=new ArrayList<>();
    int limiteX, limiteY;
    
    /**
     *
     */
    @Override
    public void mover() {
        for(INaveInimiga alien: aliens){
        alien.mover();
        }
    }
    
    /**
     *
     * @param in
     */
    public void addNaveInimiga(INaveInimiga in){
        aliens.add(in);
    }

    /**
     *
     * @param in
     */
    public void removeNaveInimiga(INaveInimiga in){
        aliens.remove(in);
    }

    /**
     *
     * @return
     */
    @Override
    public int getX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    @Override
    public int getY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    @Override
    public void atira() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
}
