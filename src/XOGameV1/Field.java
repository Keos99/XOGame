package XOGameV1;

/**
 * Created by Keos99 on 17.07.2017.
 */
public class Field {

    Player player;

    private char gamefield[][] = new char[3][3];

    private char emptycell;

    Field(){
        emptycell = ' ';
    }

    char getField(int y, int x){
        return gamefield[y][x];
    }

    void setField(int y,int x, char ch){
        gamefield[y][x] = ch;
    }

    void fieldInit(){
        char number = '1';
        for (int count = 0; count < gamefield.length; count++){
            for (int count2 = 0; count2 < gamefield.length; count2++){
                gamefield[count][count2] = number;
                number++;
            }
        }
    }

    void showField(){
        System.out.println("\t " + gamefield[0][0] + " \u2503 " + gamefield[0][1] + " \u2503 " + gamefield[0][2]);
        System.out.println("\t \u2501\u2501\u2501\u254B\u2501\u2501\u2501\u254B\u2501\u2501\u2501");
        System.out.println("\t " + gamefield[1][0] + " \u2503 " + gamefield[1][1] + " \u2503 " + gamefield[1][2]);
        System.out.println("\t \u2501\u2501\u2501\u254B\u2501\u2501\u2501\u254B\u2501\u2501\u2501");
        System.out.println("\t " + gamefield[2][0] + " \u2503 " + gamefield[2][1] + " \u2503 " + gamefield[2][2]);
    }

    boolean isCellEmpty (int y, int x){
        boolean ice = true;
        char ch = gamefield[y][x];

        switch (ch){
            case 'X':
                System.out.println("Ячейка занята, выберите другую");
                break;
            case 'O':
                System.out.println("Ячейка занята, выберите другую");
                break;
            default:
                ice = false;
        }
        return ice;
    }

    int charToIntForIGO(int y, int x, char ch){
        int cell = 0;
        if (gamefield[y][x] == ch){
            cell = 1;
        }
        return cell;
    }

    void messageForIGO(char ch){
        if (ch == player.getPlayerchar()){
            System.out.println("Вы выйграли!!!!");
        }
        else {
            System.out.println("Вы проиграли!!!!");
        }
    }

    boolean isGameOver (char ch, Player player){
        boolean igo = true;

        if (charToIntForIGO(0,0, ch) == 1 && charToIntForIGO(0,1, ch) == 1 && charToIntForIGO(0,2, ch) == 1){
            igo = false;
            messageForIGO(ch);
        }
        else if (charToIntForIGO(1,0, ch) == 1 && charToIntForIGO(1,1, ch) == 1 && charToIntForIGO(1,2, ch) == 1){
            igo = false;
            messageForIGO(ch);
        }
        else if (charToIntForIGO(2,0, ch) == 1 && charToIntForIGO(2,1, ch) == 1 && charToIntForIGO(2,2, ch) == 1){
            igo = false;
            messageForIGO(ch);
        }
        else if (charToIntForIGO(0,0, ch) == 1 && charToIntForIGO(1,0, ch) == 1 && charToIntForIGO(2,0, ch) == 1){
            igo = false;
            messageForIGO(ch);
        }
        else if (charToIntForIGO(0,1, ch) == 1 && charToIntForIGO(1,1, ch) == 1 && charToIntForIGO(2,1, ch) == 1){
            igo = false;
            messageForIGO(ch);
        }
        else if (charToIntForIGO(0,2, ch) == 1 && charToIntForIGO(1,2, ch) == 1 && charToIntForIGO(2,2, ch) == 1){
            igo = false;
            messageForIGO(ch);
        }
        else if (charToIntForIGO(0,0, ch) == 1 && charToIntForIGO(1,1, ch) == 1 && charToIntForIGO(2,2, ch) == 1){
            igo = false;
            messageForIGO(ch);
        }
        else if (charToIntForIGO(0,2, ch) == 1 && charToIntForIGO(1,1, ch) == 1 && charToIntForIGO(2,0, ch) == 1){
            igo = false;
            messageForIGO(ch);
        }

        return igo;
    }
}
