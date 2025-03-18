package homework01;

import java.util.Scanner;

public class ExchangeRate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("원화(won) 입력: ");
        int won = input.nextInt();

        double dollar = won / 1450.0;

        // 소수점 둘째 자리까지 출력
        System.out.printf("%.2f \n", dollar);
    }
}
