/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.interfaces;

import model.Alien;
import model.Player;

/**
 *
 * @author Lucas Vinicius
 */
public interface IFabricaDeNaves {
    Alien criaNavesInimigas();
    Player criaNavesAmigas();
}
