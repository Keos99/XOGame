import java.util.Scanner;

/**
 * Created by Keos99 on 17.07.2017.
 */
public class Player {

    Scanner scanner = new Scanner(System.in);
    Field field = new Field();

    private char playerChar;

    Player(){
        playerChar = ' ';
    }

    void setPlayerChar(char ch){
        playerChar = ch;
    }

    char getPlayerChar() {
        return playerChar;
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
                playerChar = 'X';
                break;
            case 2:
                playerChar = 'O';
                break;
        }
    }

    void doShoot(){
        int cell = 0;

        System.out.println("Выберите клетку:");
        cell = scanner.nextInt();

        switch (cell){
            case 1:
                field.setField(0,0,playerChar);
                break;
            case 2:
                field.setField(0,1,playerChar);
                break;
            case 3:
                field.setField(0,2,playerChar);
                break;
            case 4:
                field.setField(1,0,playerChar);
                break;
            case 5:
                field.setField(1,1,playerChar);
                break;
            case 6:
                field.setField(1,2,playerChar);
                break;
            case 7:
                field.setField(2,0,playerChar);
                break;
            case 8:
                field.setField(2,1,playerChar);
                break;
            case 9:
                field.setField(2,2,playerChar);
                break;
        }
    }

}
