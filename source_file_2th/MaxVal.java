package homework01;

import java.util.Scanner;

public class MaxVal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("숫자 3개 입력: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int max;

        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }

        System.out.println(max);
    }
}