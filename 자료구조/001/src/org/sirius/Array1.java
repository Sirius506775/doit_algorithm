/*
    - 001. 숫자의 합 구하기
    - N개의 숫자가 공백 없이 써있다. 이 숫자를 모두 합해 출력하는 프로그램을 작성하시오.
    - 제한시간 : 1초
 */


package org.sirius;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String[] arr = new String[num];

        String sNum = sc.next();


        String[] arr2 = sNum.split("");


        int result = 0;
        for (int i = 0; i < arr2.length; i++) {
            result += Integer.parseInt(arr2[i]);
        }
        System.out.println(result);









    }
}
