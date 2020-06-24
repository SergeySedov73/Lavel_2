package Lesson_1.Marathon.course;


import Lesson_1.Marathon.competitor.Competitor;

public class Cross extends Obstacle {
    int length;

    public Cross(int length) {

        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {

        competitor.run(length);
    }
}
