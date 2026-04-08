public class practiceJava2 {
    public static void main(String[] args) {
        // task-16
//    practiceJava2 t16 = new practiceJava2();
//    System.out.println(t16.fizzString("fib"));
        // task-17
//    practiceJava2 t17 = new practiceJava2();
//        System.out.println(t17.inOrder(1, 2, 3, false));
        // task-18
//     practiceJava2 t18 = new practiceJava2();
//     System.out.println(t18.lessBy10(1, 7, 11));
        // task-19
//       practiceJava2 t19 = new practiceJava2();
//        System.out.println(t19.redTicket(2, 2, 2));
        // task-20
//        practiceJava2 t20 = new practiceJava2();
//        System.out.println(t20.shareDigit(12, 43));
        // task-21
//        practiceJava2 t21 = new practiceJava2();
//        System.out.println(t21.squirrelPlay(95, true));
        // task-22
//        practiceJava2 t22 = new practiceJava2();
//        System.out.println(t22.alarmClock(5, false));
        // task-23
        practiceJava2 t23 = new practiceJava2();
        System.out.println(t23.specialEleven(22));
        // task-24
        // task-25
        // task-26
        // task-27
        // task-28
    }

    public String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        } else {
            return str;
        }
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {

        if (bOk == false) {
            if (b > a && c > b) {
                return true;
            } else {
                return false;
            }
        } else {
            if (c > b) {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean lessBy10(int a, int b, int c) {

        if (Math.abs(a - b) >= 10) {
            return true;
        } else if (Math.abs(a - c) >= 10) {
            return true;
        } else if (Math.abs(b - c) >= 10) {
            return true;
        } else {
            return false;
        }
    }

    public int redTicket(int a, int b, int c) {

        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (b != a && c != a) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean shareDigit(int a, int b) {

        int leftA = a / 10;
        int rightA = a % 10;
        int leftB = b / 10;
        int rightB = b % 10;

        if (leftA == leftB) {
            return true;
        } else if (leftA == rightB) {
            return true;
        } else if (rightA == leftB) {
            return true;
        } else if (rightA == rightB) {
            return true;
        } else {
            return false;
        }
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer == false) {
            if (temp >= 60 && temp <= 90) {
                return true;
            } else {
                return false;
            }
        } else {
            if (temp >= 60 && temp <= 100) {
                return true;
            } else {
                return false;
            }
        }
    }
    public String alarmClock(int day, boolean vacation){

        if (vacation == false){
            if (day >= 1 && day <= 5){
                return "7:00";
            }
            else{
                return "10:00";
            }
        }
        else{
            if (day >= 1 && day <= 5){
                return "10:00";
            }
            else{
                return "off";
            }
        }
    }
    public boolean specialEleven(int n){

        if (n % 11 == 0){
            return true;
        }
        else if (n % 11 == 1){
            return true;
        }
        else{
            return false;
        }
    }
}
