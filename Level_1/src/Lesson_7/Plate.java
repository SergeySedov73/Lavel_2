package Lesson_7;

class Plate {
     int food;
     int water;
     Plate(int food, int water) {
           this.food = food;
         this.water = water;
     }
     void increaseFood()
    {
            food = 100;
        System.out.println("Тарелка наполнена " + food+ " едой!");
    }
    void increaseWater()
    {
        water = 200;
        System.out.println("Тарелка наполнена " + water+ " водой!");
    }

    void decreaseFood(int n) {if (food-n > 0)food -= n;}
    void decreaseWater(int n) {if (water-n > 0)water -= n;}

    void info() {System.out.println("plate: " + "еда - " + food + ", вода - " + water);}
}
