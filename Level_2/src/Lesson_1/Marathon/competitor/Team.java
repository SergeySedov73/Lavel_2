package Lesson_1.Marathon.competitor;

public class Team {
    private String title;
    private Competitor[] members;

    public Competitor[] getMembers() {
        return members;
    }

    public Team(String title, Competitor...members) {
        this.title = title;
        this.members = members;
    }

    public void showWinners() {
        System.out.println("winers");
        for(Competitor o: members) {
            if(o.isOnDistance()) {
                o.infoWin();
            }
            else{
                o.infoLos();
//                System.out.println( "not winer");
                }
        }
    }
}