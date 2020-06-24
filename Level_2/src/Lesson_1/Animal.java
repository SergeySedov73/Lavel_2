package Lesson_1;

public class Animal
{
    private int a = 2;
    protected int z= 99;
    public Animal(int aa){
        System.out.println("Запущен конструктор Animal");
        System.out.println("Animal\t"+ "a = " + a + ", " + "aa = " + aa + ", "+ "z = "+ z);
        this.a = aa;
        System.out.println("Animal\t"+ "a = " + a + ", " + "aa = " + aa + ", "+ "z = "+ z);
    }
    void test() {
        System.out.println("Animal test");
    }
}
class Cat extends Animal
{
    private int b;
    protected int z = 88;
    public Cat(int bb, int zz){
        super(10);
        this.b = bb;
        this.z = zz;
      System.out.println("Cat");
    }
    void test() {
        System.out.println("Cat test");
    }
}
class SuperCat extends Cat
{
    public SuperCat(int b, int z){
        super(b, z);

        System.out.println("SuperCat");
    }
    void test(){
        System.out.println("SuperCat test");
    }
}
class MainTest {
    public static void main(String[] args)
    {  SuperCat superCat = new SuperCat(10,11);
//        Animal[] mass = {new Animal(1), new Cat(1,2), new SuperCat(1,2)};
//            for (Animal o : mass) {
//            o.test();
//        }
    }
}