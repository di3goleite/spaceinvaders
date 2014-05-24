/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.composite;

import java.util.ArrayList;
import model.IAlien;

/**
 *
 * @author lucas
 */
public class NaveIminigaComposta implements INaveInimiga{
    ArrayList<INaveInimiga> aliens=new ArrayList<>();
    
    /**
     *
     */
    @Override
    public void mover() {
      
    }
    
    public void addNaveInimiga(INaveInimiga in){
    aliens.add(in);
    }
    public void removeNaveInimiga(INaveInimiga in){
    aliens.remove(in);
    }
    
    
}
