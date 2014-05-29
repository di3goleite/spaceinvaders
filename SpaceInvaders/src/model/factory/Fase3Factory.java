package model.factory;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.swing.ImageIcon;
import model.Alien;
import model.Barreira;
import model.Player;
import model.composite.INaveInimiga;
import model.composite.NaveIminigaComposta;
import model.flyweight.ImagemAlien1;
import model.flyweight.ImagemAlien2;
import model.flyweight.ImagemAlien3;
import model.flyweight.ImagemAlien4;
import model.flyweight.ImagemAlien5;
import model.flyweight.MyImagem;
import model.interfaces.IPlayer;

/**
 *
 * @author lucas
 */
public class Fase3Factory implements IFaseFactory {

    NaveIminigaComposta inimigos = new NaveIminigaComposta(); // o conjunto de inimigos não pode ser
    private int largura, altura;

    //criado toda vez que for inserido um novo inimigo

    public Fase3Factory(int largura, int altura) {
        this.altura = altura;
        this.largura = largura;
    }

    /**
     *
     * @return
     */
    @Override
    public INaveInimiga criaInimigos() {
        inimigos.setParedeX(largura);
        inimigos.setParedeY(altura);
        int x, y = 10;
        Alien a;
        ArrayList<MyImagem> ia1 = new ArrayList<>();
        ia1.add(new ImagemAlien1());
        ia1.add(new ImagemAlien2());
        ia1.add(new ImagemAlien3());
        ia1.add(new ImagemAlien4());
        ia1.add(new ImagemAlien5());
        for (int i = 0; i < 5; i++) { // disposição dos inimigos (ajeitar ainda)
            x = 10;
            for (int j = 0; j < 11; j++) {
                a = new Alien(x, y);
                inimigos.addNaveInimiga(a);
                a.setImage(ia1.get(i).getImage());

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
        Player.getInstance().setX(largura / 2);
        Player.getInstance().setY(altura - altura / 5);
        p.setImage(
                new ImageIcon("src/interface1/multimidia/imagens/personagens/naveAmiga.png"));
        p.setVidas(3);
        return p;
    }

    /**
     *
     * @return
     */
    @Override
    public ConcurrentLinkedQueue criaBarreiras() {
        ConcurrentLinkedQueue<Barreira> barreiras = new ConcurrentLinkedQueue<>();
        return barreiras;
    }

}