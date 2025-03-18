package loop;

/*public class Break_continue_Test {

    //while 심화
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (true) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
            i++;
        }
    }
}*/

public class Break_continue_Test {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
