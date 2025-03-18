package homework01;

import java.util.Scanner;

public class BmiCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("체중(kg) 입력: ");
        double a = input.nextDouble();

        System.out.print("신장(cm) 입력: ");
        double b = input.nextDouble();

        double c = b / 100.0; 
        double d = a / (c * c);

        System.out.printf("BMI : %.2f\n", d);
    }
}
