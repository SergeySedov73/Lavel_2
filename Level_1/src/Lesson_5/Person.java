package Lesson_5;
//1.	Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//        2.	Конструктор класса должен заполнять эти поля при создании объекта.
//        3.	Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//        4.	Создать массив из 5 сотрудников.
//        Пример:
//        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//        persArray[1] = new Person(...);
//        ...
//        persArray[4] = new Person(...);
//        5.	С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

public class Person
{
    private String fullName; //ФИО
    private  String position; //должность
    private String email;
    private int phone;
    private int wage; //зарплата
    private int age; // возраст

    Person (String fullName, String position, String  email, int phone,int wage, int age )
    {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.wage = wage;
        this.age = age;


    }

//    public void printPerson (String fullName, String position, String  email, int phone, int wage, int age)
//    {
//                System.out.println(String fullName, String position, String  email, int phone,int wage, int age );
//    }


}
