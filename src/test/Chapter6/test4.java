import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please input your number:");
        int num = in.nextInt();
        Decompose(num);
    }

    private static void Decompose(int num) {
        System.out.print(num + "=");
        if (num < 2)
            System.out.println("not a primie");
        else {
            for (int i = 2; i <= num; i++) {
                while (num % i == 0 && num != i) {
                    num = num / i;
                    System.out.print(i + "*");
                }
                if (num == i) {
                    System.out.print(i);
                    break;
                }
            }
        }
    }
}