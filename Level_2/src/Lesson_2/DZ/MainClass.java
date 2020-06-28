package Lesson_2.DZ;

import java.util.Arrays;
import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        int iii = 4;
        int jjj = 4;
        int sum = 0;
        Random random = new Random();
        String[][] sArray = new String[iii][jjj];

        System.out.println(Arrays.deepToString(sArray));

        for(int i = 0; i < iii; i++) {
            for(int j = 0; j < jjj; j++) {
                sArray[i][j] = String.valueOf(random.nextInt(10));
            }
        }//    sArray[0][0] = "asd";
        try {
            sum = sumArray(sArray,iii,jjj);
        } catch (MyArraySizeExeption e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
        System.out.println(Arrays.deepToString(sArray));
    }

    public static int sumArray(String[][] sArray, int iii, int jjj){
        int sum = 0;
        if(sArray.length != iii) throw new MyArraySizeExeption();
        for(int i = 0; i < sArray.length; i++) {
            if(sArray[i].length != jjj) throw new MyArraySizeExeption();
            for(int j = 0; j < sArray[i].length; j++) {
                try {sum += Integer.parseInt(sArray[i][j]);}
                catch (NumberFormatException e) {throw new MyArrayDataException(i, j);}
            }
        }
        return sum;
    }
}
class MyArrayDataException extends RuntimeException{
    int row, column;
    public MyArrayDataException(int row, int column) {
        super(row + " " + column);
        this.row = row;
        this.column = column;
    }
}
class MyArraySizeExeption extends RuntimeException{
    public MyArraySizeExeption() {
        super("wrong size");
    }
}