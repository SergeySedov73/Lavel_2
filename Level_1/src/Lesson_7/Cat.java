package Lesson_7;
class Cat {
    String name;
    int appetite;
    int thirst; //жажда
    boolean satiety = false; // сытость

    Cat(String name, int appetite, int thirst, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.thirst = thirst;
        this.satiety = false;
           }
    void eat(Plate p) {
        if (p.food - appetite >= 0) {
            p.decreaseFood(appetite);
            System.out.println(name + " покушал и в тарелке осталось " + p.food + " еды!");
            satiety = true;
        } else {
            System.out.println(name + " Увидел, что в тарелке мало еды и зовет хозяина! МЯЯЯУ!!!");
            p.increaseFood();
            satiety = false;
        }
    }
    void drink(Plate p) {
        if (p.water - thirst >= 0) {
            p.decreaseWater(thirst);
            System.out.println(name + " попил и в тарелке осталось " + p.water + " воды!");
        } else {
            System.out.println(name + " Увидел, что в тарелке мало воды и зовет хозяина! Мур!!!");
            p.increaseWater();
        }
    }
    void infoCat() {
        if (satiety == true)
            System.out.println(name + " сыт!");
        else
            System.out.println(name + " голоден!");
    }
}
