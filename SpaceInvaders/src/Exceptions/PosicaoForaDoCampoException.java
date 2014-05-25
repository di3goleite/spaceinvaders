/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exceptions;

/**
 * Exeção para impedir que os objetos saiam da tela de visualização
 * @author Lucas
 */
public class PosicaoForaDoCampoException extends Exception {

    /**
     * Creates a new instance of <code>PosicaoForaDoCampoException</code>
     * without detail message.
     */
    public PosicaoForaDoCampoException() {
    }

    /**
     * Constructs an instance of <code>PosicaoForaDoCampoException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public PosicaoForaDoCampoException(String msg) {
        super(msg);
    }
}
