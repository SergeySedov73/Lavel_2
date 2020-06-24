package Lesson_2;

public enum Fruit {
    ORANGE("Апельсин", 3), APPLE("Яблоко", 4), BANANA("Банан", 2), CHERRY("Вишня", 1);

    private String rus;
    private int weight;

    public String getRus() {
        return rus;
    }

    public int getWeight() {
        return weight;
    }

    Fruit(String rus, int weight) {
        this.rus = rus;
        this.weight = weight;
    }
}

class MainEnum {
    final static String App = "asd";

    public static void main(String[] args) {
        //Fruit f = Fruit.APPLE;

       // if (Fruit.APPLE == )

       // Fruit f = Fruit.APPLE;

        for (Fruit o: Fruit.values()) {
            System.out.println(o + " " + o.getRus() + " " + o.getWeight() + " " + o.ordinal());
        }

      //  System.out.println(f.ordinal());
    }
}
