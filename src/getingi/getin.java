package getingi;

import java.util.Scanner;

public class getin {
    public static void main(String[] args) {
        Scanner arv = new Scanner(System.in);
        String a = arv.nextLine();
        int b = arv.nextInt();
        arv.nextLine();
        String c = arv.nextLine();
        System.out.println("name:"+a);
        System.out.println("age:"+b);
        System.out.println("address:"+c);

    }
}
