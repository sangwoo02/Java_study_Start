package loop;

public class for_Test {

    //for문 조건식 없을 때 예시

/*    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        for (; ; ) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
            i++;
        }
    }
}*/

    //중첩 반복문

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println("외부 for 시작 i:" + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("-> 내부 for " + i + "-" + j);
            }
            System.out.println("외부 for 종료 i:" + i);
            System.out.println(); //라인 구분을 위해 실행
        }
    }
}