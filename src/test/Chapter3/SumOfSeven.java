public class SumOfSeven {
    public static void main(String[] args) {
        int sum = 0;
        int t = 0;
        for(int i = 1;i <= 100;i++){
            if(i % 7 == 0){
                t += 1;
                sum += i;
            }
        }
        System.out.println("一到一百之间七的倍数的个数"+t);
        System.out.println("一到一百之间七的倍数的和"+sum);
    }
}
