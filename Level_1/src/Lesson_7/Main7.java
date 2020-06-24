package Lesson_7;

public class Main7 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 5, 10, false);
        Plate plate = new Plate(100, 200);
        plate.info();
        cat1.eat(plate);
        cat1.drink(plate);
        cat1.infoCat();
        plate.info();

        Cat[] catsArray = new Cat[5];
        catsArray[0] = new Cat ("Васька1", 30, 60, false);
        catsArray[1] = new Cat ("Васька2", 30, 60, false);
        catsArray[2] = new Cat ("Васька3", 30, 60, false);
        catsArray[3] = new Cat ("Васька4", 30, 60, false);
        catsArray[4] = new Cat ("Васька5", 30, 60, false);

        catsArray[0].eat(plate);
        catsArray[0].drink(plate);
        catsArray[0].infoCat();
        plate.info();

        catsArray[1].eat(plate);
        catsArray[1].drink(plate);
        catsArray[1].infoCat();
        plate.info();

        catsArray[2].eat(plate);
        catsArray[2].drink(plate);
        catsArray[2].infoCat();
        plate.info();

        catsArray[3].eat(plate);
        catsArray[3].drink(plate);
        catsArray[3].infoCat();
        plate.info();

       catsArray[4].eat(plate);
        catsArray[4].drink(plate);
        catsArray[4].infoCat();
        plate.info();

    }

}
