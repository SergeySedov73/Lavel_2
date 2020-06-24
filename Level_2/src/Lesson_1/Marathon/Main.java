package Lesson_1.Marathon;

import Lesson_1.Marathon.competitor.*;
import Lesson_1.Marathon.course.Course;
import Lesson_1.Marathon.course.Cross;
import Lesson_1.Marathon.course.Wall;
import Lesson_1.Marathon.course.Water;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Rocket", new Human("Bob"), new Cat("Vaska"), new Dog("Bobik"));
        Course course = new Course(new Cross(80), new Cross(120),
                        new Wall(2), new Wall(3),
                        new Water (20));
        course.doIt(team);
        team.showWinners();
    }
}