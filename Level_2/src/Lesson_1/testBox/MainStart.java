package Lesson_1.testBox;

//class MainStart{
//    public static void main(String[] args) {
//        Box bbb = new Box("bbb1", 111);
//        Box bbb4 = new Box("bbb4", 444);
//        Tools ttt = new Tools("hummer");
//        Tools ttt5 = new Tools("bummer"); // как заставить метод infoToolsAndBox использовать этот объект ttt5?
//        bbb.startTest(ttt);
//        bbb4.startTest(ttt);
//    }
//}
//class Box {
//    String name;
//    int weight;
//    public Box(String name1, int weight1) {
//        this.name = name1;
//        this.weight = weight1; }
//
//        void startTest(Tools ttt1) {
//       ttt1.infoToolsAndBox(this);
//
//        Box bbb = new Box("bbb10", 100);
//        ttt1.infoToolsAndBox(bbb);
//    }
//}
//class Tools {
//    String tools;
//    public Tools(String tools1) {
//        this.tools = tools1;
//    }
//    void infoToolsAndBox(Box bbb2) {
//        System.out.println(tools + " " + bbb2.name + " " + bbb2.weight);
//    }
//}


class MainStart{
    public static void main(String[] args) {
        Box bbb = new Box("bbb1", 111);
        Box bbb4 = new Box("bbb4", 444);
        Tools ttt = new Tools("hummer");
        Tools ttt5 = new Tools("bummer");
        bbb.startTest(ttt, ttt5);
        bbb4.startTest(ttt, ttt5);
    }
}
class Box {
    String name;
    int weight;
    public Box(String name1, int weight1) {
        this.name = name1;
        this.weight = weight1; }

    void startTest(Tools ttt1, Tools ttt2) {
        ttt1.infoToolsAndBox(this);
        ttt2.infoToolsAndBox(this);

//        Box bbb = new Box("bbb10", 100);
//        ttt1.infoToolsAndBox(bbb);
//        ttt2.infoToolsAndBox(bbb);
    }
}
class Tools {
    String tools;
    public Tools(String tools1) {
        this.tools = tools1;
    }
    void infoToolsAndBox(Box bbb2) {
        System.out.println(tools + " " + bbb2.name + " " + bbb2.weight);
    }
}