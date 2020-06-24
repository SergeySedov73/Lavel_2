package Lesson_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainExp {
    public static void main(String[] args) {

//        try {
//            int[] r = {1,2,3};
//            int a = 0;
//            r[20] = 20;
//            int b = 10 / a;
//        } catch (ArithmeticException e) {
//            System.out.println("Возникло ArithmeticException");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Выход за пределы массива");
//        } catch (Exception e) {
//            System.out.println("Возникло ArithmeticException");
//        }
//
//
//        System.out.println("END!");


  //      throw new ArithmeticException("нельзя отрицательное!");

//        try {
//            System.out.println(sqrt(-10));
//        } catch (ArithmeticException e) {
//            System.out.println("catch");
//        }

//        try {
//            test1();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.out.println(test1());
//
//        FileInputStream fileInputStream;
//
//        try {
//            fileInputStream = new FileInputStream("1.txt");
//
//
//            // работа с файлов
//            // отключение пользователя - освобождения ресурса
//        } catch (RuntimeException e) {
//
//        } catch (Exception e) {
//
//        }

//        finally {
//            //отключение пользователя - освобождения ресурса
//        }

        //отключение пользователя - освобождения ресурса

      //  test1();

//        try (FileInputStream fileInputStream = new FileInputStream("1.txt")) {
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        System.out.println(test1());

    }

    static int test1()  {
        try {
            System.out.println(111);
            return 1;
        } finally {
            System.out.println(222);
            return 2;
        }

       // FileInputStream fileInputStream = new FileInputStream("1.txt");
    }


    public static int sqrt(int n) {
        if (n > 0) {
            return n/2;
        }
        throw new ArithmeticException("нельзя отрицательное!");
    }


    static void test() throws ArithmeticException {


//        try {
//            int a = 0;
//            int b = 10 / a;
//        } catch (ArithmeticException e) {
//            System.out.println("Возникло ArithmeticException");
//        }

    }
}
