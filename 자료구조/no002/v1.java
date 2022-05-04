/*

    - 백준 1546번 평균
    - 입력 : 첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다.
            둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
            
    - 출력 : 첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.

 */


package org.sirius.no002;

import java.util.Scanner;

public class v1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int sub = sc.nextInt(); //과목 수 입력

        int sNum[] = new int[sub]; //길이가 sub인 배열 선언

        for(int i =0; i < sub; i++ ){
            sNum[i] = sc.nextInt();  //for loop를 돌면서 입력받은 점수들을 배열 n번째에 할당한다.
        }


        double max = 0; //평균값과 최대값 초기화
        double subsum = 0;

        for (int i = 0; i < sub ; i++) {
            if(sNum[i] > max){ //배열에
                max = sNum[i];
            }
            subsum += sNum[i];
        }

        double aver = (subsum * 100 / max / sub);
//        System.out.println("과목합 : " + subsum);
//        System.out.println("가장 점수 높은 과목 :" + max);

        System.out.println(aver);







    }





}
