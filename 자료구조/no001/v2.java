package org.sirius.no001;
import java.util.Scanner;
public class v2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String sNum = sc.next();
        int result = 0;

        for (int i = 0; i < num; i++) {
            result += sNum.charAt(i) - '0';
        }

        System.out.println(result);

    }

}
