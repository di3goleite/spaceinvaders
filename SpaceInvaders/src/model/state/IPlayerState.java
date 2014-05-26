/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.state;

import model.interfaces.IPlayer;

/**
 *
 * @author lucas
 */
public interface IPlayerState {
    
   void evento(IPlayer p);
   void update(IPlayer p);
    
}
