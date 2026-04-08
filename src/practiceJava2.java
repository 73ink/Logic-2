public class practiceJava2 {
    public static void main(String[] args) {
    // task-16
    practiceJava2 t16 = new practiceJava2();
    System.out.println(t16.fizzString("fib"));
    // task-17
    // task-18
    // task-19
    // task-20
    // task-21
    // task-22
    // task-23
    // task-24
    // task-25
    // task-26
    // task-27
    // task-28
}
    public String fizzString(String str){
        if (str.startsWith("f") && str.endsWith("b")){
            return "FizzBuzz";
        }
        else if (str.startsWith("f")){
            return "Fizz";
        }
        else if (str.endsWith("b")){
            return "Buzz";
        }
        else{
            return str;
        }
    }



}
