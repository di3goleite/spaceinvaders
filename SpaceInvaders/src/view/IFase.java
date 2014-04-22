/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

/**
 *
 * @author Vinícius Assis
 */
public interface IFase {
    public void criaInimigos(int posicaoX, int posicaoY);
    //public void mudaPosicaoInimigos(int posicaoX, int posicaoY);
    public void setBackImage(String URL);
    public void atualizar();
}
