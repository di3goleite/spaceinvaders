/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.factory;
import java.util.ArrayList;
import model.*;
import model.composite.INaveInimiga;

/**
 *
 * @author lucas
 */
public interface IFaseFactory {  //cria os componentes que formam o jogo. player, alien e barreiras.

    public IPlayer criaPalyer();

    public INaveInimiga criaInimigos();

    public ArrayList criaBarreiras();
}
