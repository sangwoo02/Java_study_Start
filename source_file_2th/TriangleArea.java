package homework01;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("삼각형 밑변 : ");
        double base = input.nextDouble();

        System.out.print("삼각형 높이 : ");
        double height = input.nextDouble();

        
        double area = (base * height) / 2;

       
        System.out.println(area);
    }
}