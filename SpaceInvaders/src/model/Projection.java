/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lucas
 */
public class Projection {

    int x, y;

    Projection(int positionX, int positionY) {
        this.x = positionX;
        this.y = positionY;
    }

    int getPositionX() {
        return x;
    }

    void move(int orientacao) {
        if (orientacao == 0) {
            this.y--;
        } else {
            this.y++;
        }
    }

}
