package Lesson_1.Marathon.course;

import Lesson_1.Marathon.competitor.Competitor;
import Lesson_1.Marathon.competitor.Team;
import Lesson_1.Marathon.course.Obstacle;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obs) {
        this.obstacles = obs;
    }

    public void doIt(Team team) {
        for (Competitor c : team.getMembers()) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }
}
