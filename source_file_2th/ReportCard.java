package homework1;

import java.util.Scanner;

public class ReportCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("A반 성적 입력 : ");
        int a1 = input.nextInt();
        int a2 = input.nextInt();
        int a3 = input.nextInt();
        double aAvg = (a1 + a2 + a3) / 3.0;
        System.out.println("A반 평균 : " + aAvg + "\n");

        System.out.print("B반 성적 입력 : ");
        int b1 = input.nextInt();
        int b2 = input.nextInt();
        int b3 = input.nextInt();
        double bAvg = (b1 + b2 + b3) / 3.0;
        System.out.println("B반 평균 : " + bAvg);
    }
}
