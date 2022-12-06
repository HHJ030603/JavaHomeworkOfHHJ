import java.util.Scanner;

public class test3 {
    private static void PrimeNumber(int num){
        if (num < 2)
            System.out.println("不是素数");
        else{
            int primes[] = new int[num];
            int counter = 0;
            primes[0] = 2;
            boolean sign;
            for(int i = 2;i < num;i++){
                sign=true;
                for (int j = 0; primes[j] <= Math.sqrt(i);j++){
                    if(i % primes[j] == 0){
                        sign=false;
                        break;
                    }
                }
                if (sign){
                    primes[counter] = i;
                    counter++;
                }
            }
            System.out.println(num+"以内的素数有"+counter+"个");
            for (int i=0; i < counter; i++){
                System.out.print(primes[i]+";");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please input your number:");
        int num = in.nextInt();
        PrimeNumber(num);
    }
}