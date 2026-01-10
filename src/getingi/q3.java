package getingi;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String a = input.nextLine();
        double b = input.nextInt();
        input.nextLine();
        String c = input.nextLine();
        System.out.println("my name is:" +a);
        System.out.println("my score is :" +b/10 +"/10");
        System.out.println("my department is:"+c);
    }
}
