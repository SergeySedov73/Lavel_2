import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

//public class Etc {
//    public static void main(String[] args) {
//
//        ArrayList<String> people = new ArrayList<String>();
//        // добавим в список ряд элементов
//        people.add("Tom");
//        people.add("Alice");
//        people.add("Kate");
//        people.add("Sam");
//        people.add(1, "Bob"); // добавляем элемент по индексу 1
//
//        System.out.println(people.get(1));// получаем 2-й объект
//        people.set(1, "Robert"); // установка нового значения для 2-го объекта
//
//        System.out.printf("ArrayList has %d elements \n", people.size());
//        for (String person : people) {
//
//            System.out.println(person);
//        }
//        // проверяем наличие элемента
//        if (people.contains("Tom")) {
//
//            System.out.println("ArrayList contains Tom");
//        }
//
//        // удалим несколько объектов
//        // удаление конкретного элемента
//        people.remove("Robert");
//        // удаление по индексу
//        people.remove(0);
//
//        Object[] peopleArray = people.toArray();
//        for (Object person : peopleArray) {
//
//            System.out.println(person);
//        }
//    }
//}

public class Etc {

    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<>();

        states.add("Германия");
        states.add("Германия");
        states.add("Франция");
        states.add("США");
        states.add("Россия");
        System.out.println(states); //[Германия, Германия, Франция, США, Россия]
        System.out.println(states.get(3)); //США
//        states.forEach(i -> System.out.println(i+", "));

//        for (String i:states) {
//            System.out.println(i+" ");
//            if (i.equals ("Германия")){
//                System.out.print(i+"!!!");
//                System.out.println();
//            }
//        }
    }
}


