/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.factory;
import model.interfaces.IPlayer;
import java.util.concurrent.ConcurrentLinkedQueue;
import model.composite.INaveInimiga;

/**
 *
 * @author lucas
 */
public interface IFaseFactory {  //cria os componentes que formam o jogo. player, alien e barreiras.

    /**
     *
     * @return
     */
    
    public IPlayer criaPlayer();

    /**
     *
     * @return
     */
    public INaveInimiga criaInimigos();

    /**
     *
     * @return
     */
    public ConcurrentLinkedQueue criaBarreiras();
}
