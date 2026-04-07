public class practiceJava {
    // start of main method
    public static void  main(String[] args) {
    // task-1
//    practiceJava t1 = new practiceJava();
//    System.out.println(t1.cigarParty(30, false)); // false
    // task-2
//        practiceJava t2 = new practiceJava();
//        System.out.println(t2.caughtSpeeding(65, true));
    // task-3
        practiceJava t3 = new practiceJava();
        System.out.println(t3.love6(6,4));
    // task-4
        practiceJava t4 = new practiceJava();
    // task-5
        practiceJava t5 = new practiceJava();
    // task-6
        practiceJava t6 = new practiceJava();
    // task-7
        practiceJava t7 = new practiceJava();
    // task-8
        practiceJava t8 = new practiceJava();
    // task-9
        practiceJava t9 = new practiceJava();
    // task-10
        practiceJava t10 = new practiceJava();
    // task-11
        practiceJava t11 = new practiceJava();
    // task-12
        practiceJava t12 = new practiceJava();
    // task-13
        practiceJava t13 = new practiceJava();
    // task-14
        practiceJava t14 = new practiceJava();
    // task-15
        practiceJava t15 = new practiceJava();
    }
    // end of main method
    //start of sub-methods
    // task-1 method
    public boolean cigarParty(int cigars, boolean isWeekend) {

        if (isWeekend) {
            if (cigars >= 40) {
                return true;
            }
        } else {
            if (cigars >= 40 && cigars <= 60) {
                return true;
            }
        }

        return false;
    }
    public int caughtSpeeding (int speed, boolean isBirthday){
        if (isBirthday){
            if (speed <= 65){
                return 0 ;
            } else if (speed >=66 && speed <=85) {
                return 1 ;
            } else { return 2; }
        }
        else {
            if (speed <= 60){
                return 0 ;
            } else if (speed >=61 && speed <=80) {
                return 1 ;
            } else { return 2; }
        }
    }
    public boolean love6(int a, int b){

        if (a == 6 || b == 6){
            return true;
        }
        else if (a + b == 6){
            return true;
        }
        else if (Math.abs(a - b) == 6){
            return true;
        }
        else{
            return false;
        }
    }

}
