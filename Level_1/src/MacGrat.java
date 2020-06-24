public class MacGrat {

    public static void main(String[] args)
    {
//      MyFor ();
//      MySwitch();
//      Tabulaton();
//        MyWhileInsteadFor();
        DoWhile ();
    }

    private static void MySwitch() {
        int month = 2, year = 2020, num = 31;
        switch (month) {
            case 4: case 6: case 9: case 11: num = 30; break;
            case 2:num = (year % 4 == 0) ? 29 : 28; break;}
        System.out.println(month + " / " + year + ": " + num + " дней");
    }

    private static void Tabulaton() {
        String header = "\n\tНЬЮ-ЙОРК ПРОГНОЗ НА 3 ДНЯ:\n";
        header += "\n\tДень\t\t\tМакс\t\tМин\t\t\tОсадки\n";
        header += "\t--------\t\t----\t\t---\t\t\t----------\n";
        String forecast = "\tВоскресенье\t\t68F\t\t\t48F\t\t\tЯсно\n";
        forecast += "\tПонедельник\t\t69F\t\t\t57F\t\t\tЯсно\n";
        forecast += "\tВторник\t\t\t71F\t\t\t50F\t\t\tОблачность\n";
        System.out.print(header + forecast);
    }

    private static void MyFor() {
        int num = 0;
        for (int i = 1; i < 4; i++) {
            System.out.println("Внешний цикл i=" + i);
            for (int j = 1; j < 4; j++) {
                System.out.print("\tВнутренний цикл j=" + j);
                System.out.println("\t\tВсего num=" + (++num));
            }
        }
    }

    private static void MyWhileInsteadFor() {
        int i = 1;
        int j = 1;
        int num = 0;
        while (i < 4) {
            System.out.println("Внешний цикл i=" + i);
            i++;
            while (j < 4) {
                System.out.print("\tВнутренний цикл j=" + j);
                System.out.println("\t\tВсего num=" + (++num));
                j++;
            }
            j=1;
        }
    }
    private static void DoWhile (){
        int num = 100 ;
        do{
            System.out.println( "Используем DoWhile: " + num ) ;
            num -= 10 ;
        }
        while ( num > 0 );}
}