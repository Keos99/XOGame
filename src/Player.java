import java.util.Scanner;

/**
 * Created by Keos99 on 17.07.2017.
 */
public class Player {

    Scanner scanner = new Scanner(System.in);
    Field field = new Field();

    private char playerchar;
    private char enemychar;

    Player(){
        playerchar = ' ';
        enemychar = ' ';
    }

    void setPlayerchar(char ch){
        playerchar = ch;
    }

    char getPlayerchar() {
        return playerchar;
    }

    char getEnemychar(){
        return enemychar;
    }

    void hello(){
        System.out.println("\tИгрок, приветствую тебя в игре крестики нолики!!");
        System.out.println();
        System.out.println();
    }

    void menu(){
        int choose = 0;

        System.out.println("Какими фигурами хотите играть?");
        System.out.println("\t1. Крестиками");
        System.out.println("\t2. Ноликами");

        choose = scanner.nextInt();

        switch (choose){
            case 1:
                playerchar = 'X';
                enemychar = 'O';
                break;
            case 2:
                playerchar = 'O';
                enemychar = 'X';
                break;
        }
    }

    void doShoot(Field field){
        int cell = 0;
        int y = 0;
        int x = 0;

            do {
                System.out.println("Выберите клетку:");
                cell = scanner.nextInt();

            switch (cell) {
                case 1:
                    y = 0;
                    x = 0;
                    break;
                case 2:
                    y = 0;
                    x = 1;
                    break;
                case 3:
                    y = 0;
                    x = 2;
                    break;
                case 4:
                    y = 1;
                    x = 0;
                    break;
                case 5:
                    y = 1;
                    x = 1;
                    break;
                case 6:
                    y = 1;
                    x = 2;
                    break;
                case 7:
                    y = 2;
                    x = 0;
                    break;
                case 8:
                    y = 2;
                    x = 1;
                    break;
                case 9:
                    y = 2;
                    x = 2;
                    break;
            }
        }while (field.isCellEmpty(y,x));
            field.setField(y,x, playerchar);
    }

}
