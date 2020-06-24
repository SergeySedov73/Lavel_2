package Lesson_6;

public class Animal {
    String name;
    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Животное: " + name);
    }

    public void jump(int jmp) {
        System.out.println(name + " подпрыгнул на" + jmp);
    }
}


