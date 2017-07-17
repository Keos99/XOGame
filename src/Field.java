/**
 * Created by Keos99 on 17.07.2017.
 */
public class Field {

    private char field[][] = new char[3][3];

    private char emptycell;

    Field(){
        emptycell = ' ';
    }

    char getField(int y, int x){
        return field[y][x];
    }

    void setField(int y,int x, char ch){
        field[y][x] = ch;
    }

    void fieldInit(){
        char number = '1';
        for (int count = 0; count < field.length; count++){
            for (int count2 = 0; count2 < field.length; count2++){
                field[count][count2] = number;
                number++;
            }
        }
    }

    void showField(){
        System.out.println("\t " + field[0][0] + " \u2503 " + field[0][1] + " \u2503 " + field[0][2]);
        System.out.println("\t \u2501\u2501\u2501\u254B\u2501\u2501\u2501\u254B\u2501\u2501\u2501");
        System.out.println("\t " + field[1][0] + " \u2503 " + field[1][1] + " \u2503 " + field[1][2]);
        System.out.println("\t \u2501\u2501\u2501\u254B\u2501\u2501\u2501\u254B\u2501\u2501\u2501");
        System.out.println("\t " + field[2][0] + " \u2503 " + field[2][1] + " \u2503 " + field[2][2]);
    }
}
