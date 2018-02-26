package XOGameV1;

import XOGameV1.Comp;
import XOGameV1.Field;

/**
 * Created by Keos99 on 17.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        Player player = new Player();
        Comp comp = new Comp();

        field.fieldInit();
        player.menu();
        do {
            field.showField();
            player.doShoot(field);
            field.isGameOver(player.getPlayerchar(),player);
            comp.doShoot(field, player);
        } while (field.isGameOver(player.getPlayerchar(),player));
        field.showField();
    }
}
