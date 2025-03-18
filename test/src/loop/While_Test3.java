package loop;

// while 반복문

/*public class While_Test3 {


    public static void main(String[] args) {

        int sum = 0;

        sum++;
        System.out.println("i=" + 1 + " sum= " + sum);

        sum = sum + 2;
        System.out.println("i=" + 1 + " sum= " + sum);

        sum = sum + 3;
        System.out.println("i=" + 1 + " sum= " + sum);
    }
}*/

//while 반복문2

/*public class While_Test3 {

    //while 심화
    public static void main(String[] args) {

        int sum = 0;
        int i = 10;

        sum = sum + i;
        System.out.println("i=" + i + " sum= " + sum);
        i++;

        sum = sum + i;
        System.out.println("i=" + i + " sum= " + sum);
        i++;

        sum = sum + i;
        System.out.println("i=" + i + " sum= " + sum);
        i++;

    }
}*/

//while 반복문3

public class While_Test3 {

    //while 심화
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;
        int endNum = 3;

        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i=" + i + " sum= " + sum);
            i++;
        }
    }
}


