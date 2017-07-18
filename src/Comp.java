import java.util.Random;

/**
 * Created by Keos99 on 17.07.2017.
 */
public class Comp {

    private int y;
    private int x;

    Comp(){
        y = 0;
        x = 0;
    }

    Random random = new Random();
    Field field;
    Player player;

    void doShoot (Field field, Player player){

        do {
            y = random.nextInt(3);
            x = random.nextInt(3);
        } while (field.isCellEmpty(y,x));

     field.setField(y,x,player.getEnemychar());
    }
}
