public class Main {
    public static void main(String[] args) {

        System.out.println("----Homework 1");

        boolean weekday = true, vacation = false;
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
        int a = 8999, b = 9879;
        boolean last_digit = a - (a / 10 * 10) == b - (b / 10 * 10);
        System.out.println(a +" " + a / 10 * 10);
        System.out.println(a + ", " + b + ", " + last_digit + "-legit");

        System.out.println();
        System.out.println("----Homework 4");
        int n = 1;
        while ((n % 387 != 0) || (n % 6381 != 0)) n++;
        System.out.println("First value which is divisible by 387 and 6381 is " + n);

        System.out.println();
        System.out.println("----Homework 5");

    }
}