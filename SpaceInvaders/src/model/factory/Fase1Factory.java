package model.factory;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import model.Alien;
import model.Barreira;
import model.Player;
import model.composite.INaveInimiga;
import model.composite.NaveIminigaComposta;
import model.interfaces.IPlayer;

/**
 *
 * @author lucas
 */
public class Fase1Factory implements IFaseFactory {

    NaveIminigaComposta inimigos = new NaveIminigaComposta(); // o conjunto de inimigos não pode ser
    private int largura, altura;
    //criado toda vez que for inserido um novo inimigo
    public Fase1Factory(int largura, int altura) {
        this.altura = altura;
        this.largura = largura;
    }

    /**
     *
     * @return
     */
    @Override
    public INaveInimiga criaInimigos() {

        int x = 10, y = 10;
        Alien a;
        for (int i = 0; i < 5; i++) { // disposição dos inimigos (ajeitar ainda)

            for (int j = 0; j < 16; j++) {
                a = new Alien(x, y);
                inimigos.addNaveInimiga(a);
                x += 40;
            }
            y += 25;
        }

        return inimigos;
    }

    /**
     *
     * @return
     */
    @Override
    public IPlayer criaPlayer() {
        Player p = Player.getInstance();
        System.out.println(altura +" "+ largura);
        Player.getInstance().setX(largura/2);
       Player.getInstance().setY(altura - altura/6);
        p.setImage(
                new ImageIcon("src/interface1/multimidia/imagens/personagens/naveAmiga.png"));
        return p;
    }

    /**
     *
     * @return
     */
    @Override
    public ArrayList criaBarreiras() {
        ArrayList<Barreira> barreiras = new ArrayList<>();
        barreiras.add(new Barreira());
        barreiras.add(new Barreira());
        barreiras.add(new Barreira());
        barreiras.add(new Barreira());
        return barreiras;
    }

}
