public class practiceJava {
    // start of main method
    public static void main(String[] args) {
        // task-1
//    practiceJava t1 = new practiceJava();
//    System.out.println(t1.cigarParty(30, false)); // false
        // task-2
//        practiceJava t2 = new practiceJava();
//        System.out.println(t2.caughtSpeeding(65, true));
        // task-3
//        practiceJava t3 = new practiceJava();
//        System.out.println(t3.love6(6,4));
        // task-4
//        practiceJava t4 = new practiceJava();
//        System.out.println(t4.more20(20));

        // task-5
//        practiceJava t5 = new practiceJava();
//        System.out.println(t5.nearTen(17));
        // task-6
//        practiceJava t6 = new practiceJava();
//        System.out.println(t6.teaParty(20, 6));
        // task-7
//        practiceJava t7 = new practiceJava();
//        System.out.println(t7.twoAsOne(3, 1, 2));
        // task-8
//        practiceJava t8 = new practiceJava();
//        System.out.println(t8.lastDigit(23, 19, 12 ));
        // task-9
//        practiceJava t9 = new practiceJava();
//        System.out.println(t9.maxMod5(2, 3));
        // task-10
//        practiceJava t10 = new practiceJava();
//        System.out.println(t10.blueTicket(9, 1, 0));
        // task-11
//        practiceJava t11 = new practiceJava();
//        System.out.println(t11.dateFashion(5, 10));
        // task-12
        practiceJava t12 = new practiceJava();
        System.out.println(t12.sortaSum(9, 4));
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

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            if (speed <= 65) {
                return 0;
            } else if (speed >= 66 && speed <= 85) {
                return 1;
            } else {
                return 2;
            }
        } else {
            if (speed <= 60) {
                return 0;
            } else if (speed >= 61 && speed <= 80) {
                return 1;
            } else {
                return 2;
            }
        }
    }

    public boolean love6(int a, int b) {

        if (a == 6 || b == 6) {
            return true;
        } else if (a + b == 6) {
            return true;
        } else if (Math.abs(a - b) == 6) {
            return true;
        } else {
            return false;
        }
    }

    public boolean more20(int n) {

        if (n % 20 == 1) {
            return true;
        } else if (n % 20 == 2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean nearTen(int num) {
        int reminder = num % 10;
        if (reminder == 0) {
            return true;
        } else if (reminder == 1) {
            return true;
        } else if (reminder == 2) {
            return true;
        } else if (reminder == 8) {
            return true;
        } else if (reminder == 9) {
            return true;
        } else {
            return false;
        }

    }
    public int teaParty(int tea, int candy){

        if (tea < 5 || candy < 5){
            return 0;
        } else if (tea >= candy * 2 || candy >= tea * 2){
            return 2;
        } else{
            return 1;
        }
    }
    public boolean twoAsOne(int a, int b, int c){

        if (a + b == c){
            return true;
        }
        else if (a + c == b){
            return true;
        }
        else if (b + c == a){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean lastDigit(int a, int b, int c){

        int lastA = a % 10;
        int lastB = b % 10;
        int lastC = c % 10;

        if (lastA == lastB){
            return true;
        }
        else if (lastA == lastC){
            return true;
        }
        else if (lastB == lastC){
            return true;
        }
        else{
            return false;
        }
    }
    public int maxMod5(int a, int b){

        if (a == b){
            return 0;
        }
        else if (a % 5 == b % 5){
            if (a < b){
                return a;
            } else{
                return b;
            }
        }
        else{
            if (a > b){
                return a;
            } else{
                return b;
            }
        }
    }
    public int blueTicket(int a, int b, int c){

        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if (ab == 10 || bc == 10 || ac == 10){
            return 10;
        }
        else if (ab == bc + 10 || ab == ac + 10){
            return 5;
        }
        else{
            return 0;
        }
    }
    public int dateFashion(int you, int date){

        if (you <= 2 || date <= 2){
            return 0;
        }
        else if (you >= 8 || date >= 8){
            return 2;
        }
        else{
            return 1;
        }
    }
    public int sortaSum(int a, int b){

        int sum = a + b;

        if (sum >= 10 && sum <= 19){
            return 20;
        } else{
            return sum;
        }
    }
}
