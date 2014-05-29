package model.factory;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.swing.ImageIcon;
import model.Alien;
import model.Barreira;
import model.Player;
import model.composite.INaveInimiga;
import model.composite.NaveIminigaComposta;
import model.composite.NaveIminigaCompostaPequena;
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
public class Fase1FactoryPequena implements IFaseFactory {

    NaveIminigaCompostaPequena inimigos = new NaveIminigaCompostaPequena(); // o conjunto de inimigos não pode ser
    private int largura, altura;

    //criado toda vez que for inserido um novo inimigo

    public Fase1FactoryPequena(int largura, int altura) {
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
        int x, y = 1;
        Alien a;
        ArrayList<MyImagem> ia1 = new ArrayList<>();
        ia1.add(new ImagemAlien1());
        ia1.add(new ImagemAlien2());
        ia1.add(new ImagemAlien3());
        ia1.add(new ImagemAlien4());
        ia1.add(new ImagemAlien5());
        for (int i = 0; i < 5; i++) { // disposição dos inimigos (ajeitar ainda)
            x = 1;
            for (int j = 0; j < 11; j++) {
                a = new Alien(x, y);
                inimigos.addNaveInimiga(a);
                a.setImage(ia1.get(i).getImage());

                x += 1;
            }
            y += 1;
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
        return p;
    }

    /**
     *
     * @return
     */
    @Override
    public ConcurrentLinkedQueue criaBarreiras() {
        ConcurrentLinkedQueue<Barreira> barreiras = new ConcurrentLinkedQueue<>();
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 10; i++) {
                for (int x = 0; x < 5; x++) {
                    barreiras.add(new Barreira(10+(j*30)+(5*i), (altura - altura / 4)-5 + (x * 5)));
                }
            }
        }
        return barreiras;
    }

}
