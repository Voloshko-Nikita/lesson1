// twice shift and 'show whitespace'
public class Main {
    public static void main(String[] args) {
        System.out.println("-----Homework 2");
        int a = 23,b = 100;
        if (a == b)
            System.out.println("sum of a and b squared: " + ((a * a) + (b * b)));
        else
            System.out.println("sum of a and b: " + (a + b));

        System.out.println("-----Homework 3");
        for (int i = 10; i <= 37; i = i +3)
            System.out.print(i + ", ");

        System.out.println();

        for (int i = 998; i >= 900; i = i - 2)
            System.out.print(i + ", ");
        System.out.println();

        int number = 1;
        for (int x = 1; x <= 20; x = x + 1){
            System.out.print(number + ", ");
            number = number * (-1);
        }
        System.out.println();

        number = 7;
        for (int i = 1; i <= 60; i = i + 1) {
            if (i % 3 == 0)
                System.out.print(number + 2 + ", ");
            else
                System.out.print(number + ", ");
        }
        System.out.println();

        System.out.println("-----Homework 4");
        String action = "hit";
        int T = 9;

        if (T > 21)
            action = "bust";
        else if (T >= 17)
            action = "stay";
        System.out.println(action);
        System.out.println();

        System.out.println("-----Homework 5");
        if (a >= 100 && b <= 50)
            System.out.println(1);
        else
            System.out.println(0);


        if (a >= 100 || b >= 100 && b <= 50 || a <= 50)
            System.out.println(1);
        else
            System.out.println(0);
        System.out.println();

        System.out.println("-----Homework 6");
        number = 4;
        int price = 0;
        for (int w = 1; w <= number; w = w + 1){
            if (2 <= w && w <= 5)
                price = price + 2;
            else
                price = price + 3;
        }
        System.out.println(number + " kg, " + price + " euro");

        System.out.println("-----Homework 7");
        int x = 0;
        int reminder = 1;
        while (reminder != 0){
            x = x + 1;
            reminder = (x * x * x + 91) % 47;
        }
        System.out.println("Smallest positive integer divisible by 47 in formula n^^3 + 91 is " + x);

        System.out.println("-----Homework 8");
        a = 4;
        int result = 3;
        //int i = 2;
        for (int i = 2; i <= a; i++) {
            result = result * 3;
        }
        //while (i)

        System.out.println("3 in power of " + a + " = " + result);
        a = 3;
        b = 6;
        result = b;
        for (int i = 2; i <= a; i++) {
            result = result * b;
        }
        System.out.println(b +" in power of " + a + " = " + result);

        System.out.println("-----Homework 9");
        int decrease = 0, last = 0, now = 0, deacriseTime = 0;

        for (int t = 0; t <= 100;t++){
            now = t * (t - 20) * (t - 100) + 12000;
            if (now < last && now-last < decrease){
                decrease = now - last; deacriseTime = t;}
            System.out.println(now - last + " " + t);
            last = now;
        }
        System.out.println("Max decrease was at " + deacriseTime + " hours. Decrese was " + decrease);

        System.out.println("-----Homework 10");
        a = 3090;
        b = 1030;
        int c = 0; //Buffer variable
        while(a % b != 0) {
            c = b;
            b = a % b;
            a = c;
        }
        System.out.println(b);
    }
}

