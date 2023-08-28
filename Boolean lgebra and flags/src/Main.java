public class Main {
    public static void main(String[] args) {

        System.out.println("----Homework 1");

        boolean weekday = false, vacation = true;
        if (!weekday || vacation){ // true if weekday is false or vacation is true
            System.out.println("James can sleep longer today!");
        }
        else System.out.println("James cannot sleep longer today(((");

        System.out.println();
        System.out.println("----Homework 2");

        boolean shining = true;
        int current_time = 15;

        if (shining && 10 <= current_time && current_time <= 16){
            System.out.println("Please use sunscreen.");
        }

        System.out.println();
        System.out.println("----Homework 3");
        int a = 4985, b = 9875;
        boolean last_digit = a - (a / 10 * 10) == b - (b / 10 * 10);
        System.out.println(a + ", " + b + ", " + last_digit);
    }
}