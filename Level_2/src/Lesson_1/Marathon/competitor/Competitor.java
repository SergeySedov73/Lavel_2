package Lesson_1.Marathon.competitor;

public interface Competitor {
    void run(int dist);
    void swim(int dist);
    void jump(int height);
    boolean isOnDistance();
    void infoWin();
    void infoLos();
}